package link1234gamer.fnafmod.common.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import link1234gamer.fnafmod.client.gui.GuiFNAFGameOver;
import link1234gamer.fnafmod.client.gui.GuiFNAFMainMenu;
import link1234gamer.fnafmod.client.gui.GuiOverlay;
import link1234gamer.fnafmod.client.gui.GuiOverrideHelper;
import link1234gamer.fnafmod.client.model.entity.ModelBonnie;
import link1234gamer.fnafmod.client.model.entity.ModelCandy;
import link1234gamer.fnafmod.client.model.entity.ModelChica;
import link1234gamer.fnafmod.client.model.entity.ModelEndo;
import link1234gamer.fnafmod.client.model.entity.ModelFoxy;
import link1234gamer.fnafmod.client.model.entity.ModelFredbear;
import link1234gamer.fnafmod.client.model.entity.ModelFreddy;
import link1234gamer.fnafmod.client.model.entity.ModelFuntimeFreddy;
import link1234gamer.fnafmod.client.model.entity.ModelGoldenFreddy;
import link1234gamer.fnafmod.client.model.entity.ModelMinirina;
import link1234gamer.fnafmod.client.model.entity.ModelNMFredbear;
import link1234gamer.fnafmod.client.model.entity.ModelNMRat;
import link1234gamer.fnafmod.client.model.entity.ModelNightMarionne;
import link1234gamer.fnafmod.client.model.entity.ModelPre_Mangle;
import link1234gamer.fnafmod.client.model.entity.ModelPuppet;
import link1234gamer.fnafmod.client.model.entity.ModelRPuppet;
import link1234gamer.fnafmod.client.model.entity.ModelShadowBonnie;
import link1234gamer.fnafmod.client.model.entity.ModelShadowFreddy;
import link1234gamer.fnafmod.client.model.entity.ModelSpringbonnie;
import link1234gamer.fnafmod.client.model.entity.ModelSpringtrap;
import link1234gamer.fnafmod.client.model.entity.ModelToyBonnie;
import link1234gamer.fnafmod.client.model.entity.ModelToyFreddy;
import link1234gamer.fnafmod.client.model.entity.ModelWBonnie;
import link1234gamer.fnafmod.client.model.entity.ModelWFreddy;
import link1234gamer.fnafmod.client.model.entity.ModelignitedFreddy;
import link1234gamer.fnafmod.client.render.entity.RenderBonnie;
import link1234gamer.fnafmod.client.render.entity.RenderCandy;
import link1234gamer.fnafmod.client.render.entity.RenderChica;
import link1234gamer.fnafmod.client.render.entity.RenderEndo;
import link1234gamer.fnafmod.client.render.entity.RenderFoxy;
import link1234gamer.fnafmod.client.render.entity.RenderFredbear;
import link1234gamer.fnafmod.client.render.entity.RenderFreddy;
import link1234gamer.fnafmod.client.render.entity.RenderFuntimeFreddy;
import link1234gamer.fnafmod.client.render.entity.RenderGoldenFreddy;
import link1234gamer.fnafmod.client.render.entity.RenderMinirina;
import link1234gamer.fnafmod.client.render.entity.RenderNMFredbear;
import link1234gamer.fnafmod.client.render.entity.RenderNMRat;
import link1234gamer.fnafmod.client.render.entity.RenderNightMarionne;
import link1234gamer.fnafmod.client.render.entity.RenderPre_Mangle;
import link1234gamer.fnafmod.client.render.entity.RenderPuppet;
import link1234gamer.fnafmod.client.render.entity.RenderRPuppet;
import link1234gamer.fnafmod.client.render.entity.RenderShadowBonnie;
import link1234gamer.fnafmod.client.render.entity.RenderShadowFreddy;
import link1234gamer.fnafmod.client.render.entity.RenderSpringbonnie;
import link1234gamer.fnafmod.client.render.entity.RenderSpringtrap;
import link1234gamer.fnafmod.client.render.entity.RenderToyBonnie;
import link1234gamer.fnafmod.client.render.entity.RenderToyFreddy;
import link1234gamer.fnafmod.client.render.entity.RenderWBonnie;
import link1234gamer.fnafmod.client.render.entity.RenderWFreddy;
import link1234gamer.fnafmod.client.render.entity.RenderignitedFreddy;
import link1234gamer.fnafmod.client.render.item.RenderItemTablet;
import link1234gamer.fnafmod.client.render.tile.RenderArcadeMachineBlue;
import link1234gamer.fnafmod.client.render.tile.RenderArcadeMachineCyan;
import link1234gamer.fnafmod.client.render.tile.RenderArcadeMachineGreen;
import link1234gamer.fnafmod.client.render.tile.RenderArcadeMachineOrange;
import link1234gamer.fnafmod.client.render.tile.RenderArcadeMachineRed;
import link1234gamer.fnafmod.client.render.tile.RenderArcadeMachineYellow;
import link1234gamer.fnafmod.client.render.tile.RenderCamera;
import link1234gamer.fnafmod.client.render.tile.RenderCupcake;
import link1234gamer.fnafmod.client.render.tile.RenderDesk;
import link1234gamer.fnafmod.client.render.tile.RenderF_Plushie;
import link1234gamer.fnafmod.client.render.tile.RenderGuitarStand;
import link1234gamer.fnafmod.common.entity.EntityBonnie;
import link1234gamer.fnafmod.common.entity.EntityCandy;
import link1234gamer.fnafmod.common.entity.EntityChica;
import link1234gamer.fnafmod.common.entity.EntityEndo;
import link1234gamer.fnafmod.common.entity.EntityFoxy;
import link1234gamer.fnafmod.common.entity.EntityFredbear;
import link1234gamer.fnafmod.common.entity.EntityFreddy;
import link1234gamer.fnafmod.common.entity.EntityFuntimeFreddy;
import link1234gamer.fnafmod.common.entity.EntityGoldenFreddy;
import link1234gamer.fnafmod.common.entity.EntityIgnitedFreddy;
import link1234gamer.fnafmod.common.entity.EntityMinirina;
import link1234gamer.fnafmod.common.entity.EntityNMFredbear;
import link1234gamer.fnafmod.common.entity.EntityNMRat;
import link1234gamer.fnafmod.common.entity.EntityNightMarionne;
import link1234gamer.fnafmod.common.entity.EntityPre_Mangle;
import link1234gamer.fnafmod.common.entity.EntityPuppet;
import link1234gamer.fnafmod.common.entity.EntityRPuppet;
import link1234gamer.fnafmod.common.entity.EntityShadowBonnie;
import link1234gamer.fnafmod.common.entity.EntityShadowFreddy;
import link1234gamer.fnafmod.common.entity.EntitySpringbonnie;
import link1234gamer.fnafmod.common.entity.EntitySpringtrap;
import link1234gamer.fnafmod.common.entity.EntityToyBonnie;
import link1234gamer.fnafmod.common.entity.EntityToyFreddy;
import link1234gamer.fnafmod.common.entity.EntityWBonnie;
import link1234gamer.fnafmod.common.entity.EntityWFreddy;
import link1234gamer.fnafmod.common.event.ClientEventHandler;
import link1234gamer.fnafmod.common.item.FNAFItems;
import link1234gamer.fnafmod.common.tileentity.TileEntityArcadeMachineBlue;
import link1234gamer.fnafmod.common.tileentity.TileEntityArcadeMachineCyan;
import link1234gamer.fnafmod.common.tileentity.TileEntityArcadeMachineGreen;
import link1234gamer.fnafmod.common.tileentity.TileEntityArcadeMachineOrange;
import link1234gamer.fnafmod.common.tileentity.TileEntityArcadeMachineRed;
import link1234gamer.fnafmod.common.tileentity.TileEntityArcadeMachineYellow;
import link1234gamer.fnafmod.common.tileentity.TileEntityCamera;
import link1234gamer.fnafmod.common.tileentity.TileEntityCupcake;
import link1234gamer.fnafmod.common.tileentity.TileEntityDesk;
import link1234gamer.fnafmod.common.tileentity.TileEntityF_Plushie;
import link1234gamer.fnafmod.common.tileentity.TileEntityGuitarStand;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySpringtrap.class, new RenderSpringtrap(new ModelSpringtrap(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntitySpringbonnie.class, new RenderSpringbonnie(new ModelSpringbonnie(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityFredbear.class, new RenderFredbear(new ModelFredbear(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityPre_Mangle.class, new RenderPre_Mangle(new ModelPre_Mangle(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityCandy.class, new RenderCandy(new ModelCandy(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityBonnie.class, new RenderBonnie(new ModelBonnie(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityFreddy.class, new RenderFreddy(new ModelFreddy(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityNMFredbear.class, new RenderNMFredbear(new ModelNMFredbear(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityFuntimeFreddy.class, new RenderFuntimeFreddy(new ModelFuntimeFreddy(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityFoxy.class, new RenderFoxy(new ModelFoxy(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityGoldenFreddy.class, new RenderGoldenFreddy(new ModelGoldenFreddy(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityShadowFreddy.class, new RenderShadowFreddy(new ModelShadowFreddy(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityShadowBonnie.class, new RenderShadowBonnie(new ModelShadowBonnie(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityChica.class, new RenderChica(new ModelChica(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityPuppet.class, new RenderPuppet(new ModelPuppet(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityRPuppet.class, new RenderRPuppet(new ModelRPuppet(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityNMRat.class, new RenderNMRat(new ModelNMRat(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityWBonnie.class, new RenderWBonnie(new ModelWBonnie(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityToyBonnie.class, new RenderToyBonnie(new ModelToyBonnie(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityNightMarionne.class, new RenderNightMarionne(new ModelNightMarionne(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityMinirina.class, new RenderMinirina(new ModelMinirina(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityWFreddy.class, new RenderWFreddy(new ModelWFreddy(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityIgnitedFreddy.class, new RenderignitedFreddy(new ModelignitedFreddy(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityToyFreddy.class, new RenderToyFreddy(new ModelToyFreddy(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityEndo.class, new RenderEndo(new ModelEndo(), 0));
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityArcadeMachineRed.class, new RenderArcadeMachineRed());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityArcadeMachineBlue.class, new RenderArcadeMachineBlue());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityArcadeMachineGreen.class, new RenderArcadeMachineGreen());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityArcadeMachineCyan.class, new RenderArcadeMachineCyan());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityArcadeMachineYellow.class, new RenderArcadeMachineYellow());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityArcadeMachineOrange.class, new RenderArcadeMachineOrange());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityF_Plushie.class, new RenderF_Plushie());
//      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBox.class, new RenderBox());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCupcake.class, new RenderCupcake());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCamera.class, new RenderCamera());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGuitarStand.class, new RenderGuitarStand());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDesk.class, new RenderDesk());
//      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLightButton.class, new RenderLightButton());
        
        MinecraftForgeClient.registerItemRenderer(FNAFItems.tablet, new RenderItemTablet());  
        
	}

        public void preInit()
        {
            super.preInit();           
    		GuiOverrideHelper.addOverride(GuiMainMenu.class, new GuiFNAFMainMenu());
        	GuiOverrideHelper.addOverride(GuiGameOver.class, new GuiFNAFGameOver());
    		
    		MinecraftForge.EVENT_BUS.register(new GuiOverlay(Minecraft.getMinecraft()));
    		MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
            FMLCommonHandler.instance().bus().register(new ClientEventHandler());
	    }
        
        public void init()
    	{
    		super.init();
    		
    		MinecraftForgeClient.registerItemRenderer(FNAFItems.tablet, new RenderItemTablet());    		
    	}

}
	