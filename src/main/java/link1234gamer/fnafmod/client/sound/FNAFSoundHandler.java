package link1234gamer.fnafmod.client.sound;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import link1234gamer.fnafmod.FNAFMod;
import link1234gamer.fnafmod.common.config.FNAFConfig;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class FNAFSoundHandler

{
	public static SoundFNAF deathStatic = SoundFNAF.makeSound(new ResourceLocation(FNAFMod.MODID, "static"), false);
}