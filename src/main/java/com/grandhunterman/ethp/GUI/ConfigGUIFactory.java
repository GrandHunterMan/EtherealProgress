package com.grandhunterman.ethp.GUI;

import com.grandhunterman.ethp.handlers.ConfigHandler;
import com.grandhunterman.ethp.ref;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiKeyBindingList;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.IConfigElement;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by GrandHunterMan on Jul 11. Copyright 2017.
 */
public class ConfigGUIFactory implements IModGuiFactory {


    @Override
    public void initialize(Minecraft minecraftInstance) {
    }

    @Override
    public boolean hasConfigGui() {
        return true;
    }

    @Override
    public GuiScreen createConfigGui(GuiScreen parentScreen) {
        return new GUIConfig(parentScreen);
    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return GUIConfig.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }

    @Nullable
    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }
    public static class GUIConfig extends GuiConfig {
        public GUIConfig(GuiScreen parentScreen) {
            super(parentScreen, getConfigElements(), ref.MODID, false, false, I18n.format("gui.config.main_title"));
        }

        private static List<IConfigElement> getConfigElements() {
            List<IConfigElement> list = new ArrayList<IConfigElement>();
            list.add(new DummyConfigElement.DummyCategoryElement(I18n.format("gui.config.category.items"), "gui.config.category.items", CategoryEntryItems.class));
            return list;
        }
        public static class CategoryEntryItems extends GuiConfigEntries.CategoryEntry{

            public CategoryEntryItems(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
                super(owningScreen, owningEntryList, configElement);
            }

            @Override
            protected GuiScreen buildChildScreen() {
                Configuration configuration = ConfigHandler.getConfig();
                ConfigElement categoryitems = new ConfigElement(configuration.getCategory(ConfigHandler.CATEGORY_NAME_ITEMS));
                List<IConfigElement> propertiesOnScreen = categoryitems.getChildElements();
                String windowTitle = I18n.format("gui.config.category.items");
                return new GuiConfig(owningScreen, propertiesOnScreen, owningScreen.modID, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart, this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart, windowTitle);
            }
        }
    }
}
