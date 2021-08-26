// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer main;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 22.0F, 0.0F);
		main.setTextureOffset(84, 108).addBox(-6.0F, -9.0F, -5.0F, 11.0F, 9.0F, 11.0F, 0.0F, false);
		main.setTextureOffset(100, 97).addBox(-4.0F, -18.0F, -3.0F, 7.0F, 3.0F, 7.0F, 0.0F, false);
		main.setTextureOffset(48, 113).addBox(-5.0F, -15.0F, -4.0F, 9.0F, 6.0F, 9.0F, 0.0F, false);
		main.setTextureOffset(108, 89).addBox(-3.0F, -20.0F, -2.0F, 5.0F, 2.0F, 5.0F, 0.0F, true);
		main.setTextureOffset(116, 83).addBox(-2.0F, -21.0F, -1.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		main.setTextureOffset(124, 80).addBox(-1.0F, -22.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		main.setTextureOffset(106, 63).addBox(4.0F, -8.0F, -4.0F, 2.0F, 7.0F, 9.0F, 0.0F, false);
		main.setTextureOffset(106, 47).addBox(-7.0F, -8.0F, -4.0F, 2.0F, 7.0F, 9.0F, 0.0F, false);
		main.setTextureOffset(108, 38).addBox(-5.0F, -8.0F, 6.0F, 9.0F, 7.0F, 1.0F, 0.0F, false);
		main.setTextureOffset(108, 29).addBox(-5.0F, -8.0F, -6.0F, 9.0F, 7.0F, 1.0F, 0.0F, false);
		main.setTextureOffset(92, 18).addBox(-5.0F, 0.0F, -4.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		main.setTextureOffset(112, 5).addBox(4.0F, -14.0F, -3.0F, 1.0F, 5.0F, 7.0F, 0.0F, false);
		main.setTextureOffset(93, 0).addBox(-6.0F, -14.0F, -3.0F, 1.0F, 5.0F, 7.0F, 0.0F, false);
		main.setTextureOffset(31, 122).addBox(-4.0F, -14.0F, 5.0F, 7.0F, 5.0F, 1.0F, 0.0F, false);
		main.setTextureOffset(13, 122).addBox(-4.0F, -14.0F, -5.0F, 7.0F, 5.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}