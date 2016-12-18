package link1234gamer.fnafmod.common.block;

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
import link1234gamer.fnafmod.common.tileentity.TileEntityLightButton;
import net.minecraft.block.Block;

public class FNAF_Blocks {
		// Decoration Blocks
		public static Block Arcade_Machine_Red;
		public static Block Arcade_Machine_Blue;
		public static Block Arcade_Machine_Green;
		public static Block Arcade_Machine_Cyan;
		public static Block Arcade_Machine_Yellow;
		public static Block Arcade_Machine_Orange;
		public static Block F_Plushie;
		public static Block Cupcake;
		public static Block Camera;
		public static Block Stand;
		public static Block Desk;
//		public static Block LightButton;
//		public static Block Box;
		
		public static void register()
		{
			Arcade_Machine_Red = new BlockArcadeMachineRed().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
			Arcade_Machine_Blue = new BlockArcadeMachineBlue().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
			Arcade_Machine_Green = new BlockArcadeMachineGreen().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
			Arcade_Machine_Cyan = new BlockArcadeMachineCyan().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
			Arcade_Machine_Yellow = new BlockArcadeMachineYellow().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
			Arcade_Machine_Orange = new BlockArcadeMachineOrange().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
			F_Plushie = new BlockF_Plushie().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeCloth);
//			Box = new BlockBox().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeWood);
			Cupcake = new BlockCupcake().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeCloth);
			Camera = new BlockCamera().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
			Stand = new BlockGuitarStand().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
			Desk = new BlockDesk().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeWood);
//			LightButton = new BlockLightButton().setHardness(5.0F).setResistance(10.0F);
			
			BlockRegistry.registerTileEntity(Arcade_Machine_Red, "Red Arcade Machine", TileEntityArcadeMachineRed.class);
			BlockRegistry.registerTileEntity(Arcade_Machine_Blue, "Blue Arcade Machine", TileEntityArcadeMachineBlue.class);
			BlockRegistry.registerTileEntity(Arcade_Machine_Green, "Green Arcade Machine", TileEntityArcadeMachineGreen.class);
			BlockRegistry.registerTileEntity(Arcade_Machine_Cyan, "Cyan Arcade Machine", TileEntityArcadeMachineCyan.class);
			BlockRegistry.registerTileEntity(Arcade_Machine_Yellow, "Yellow Arcade Machine", TileEntityArcadeMachineYellow.class);
			BlockRegistry.registerTileEntity(Arcade_Machine_Orange, "Orange Arcade Machine", TileEntityArcadeMachineOrange.class);
			BlockRegistry.registerTileEntity(F_Plushie, "F_Plushie", TileEntityF_Plushie.class);
//			BlockRegistry.registerTileEntity(Box, "box", TileEntityBox.class);
			BlockRegistry.registerTileEntity(Cupcake, "Cupcake", TileEntityCupcake.class);
			BlockRegistry.registerTileEntity(Camera, "Camera", TileEntityCamera.class);
			BlockRegistry.registerTileEntity(Stand, "Stand", TileEntityGuitarStand.class);
			BlockRegistry.registerTileEntity(Desk, "Desk", TileEntityDesk.class);
//			BlockRegistry.registerTileEntity(LightButton, "l-button", TileEntityLightButton.class);
			
		}
	}
