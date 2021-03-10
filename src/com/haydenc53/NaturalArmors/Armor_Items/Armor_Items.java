package com.haydenc53.NaturalArmors.Armor_Items;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class Armor_Items
{
    final static double LEATHER_HELM_ARMOR_POINTS = 1.0;
    final static double LEATHER_CHEST_ARMOR_POINTS = 3.0;
    final static double LEATHER_LEGS_ARMOR_POINTS = 2.0;
    final static double LEATHER_BOOTS_ARMOR_POINTS = 1.0;

    final static double CHAINMAIL_HELM_ARMOR_POINTS = 2.0;
    final static double CHAINMAIL_CHEST_ARMOR_POINTS = 5.0;
    final static double CHAINMAIL_LEGS_ARMOR_POINTS = 4.0;
    final static double CHAINMAIL_BOOTS_ARMOR_POINTS = 1.0;


    // Wood Armor
    public static ItemStack WOOD_HELM;
    public static ItemStack WOOD_CHEST;
    public static ItemStack WOOD_LEGS;
    public static ItemStack WOOD_BOOTS;

    // Stone Armor
    public static ItemStack STONE_HELM;
    public static ItemStack STONE_CHEST;
    public static ItemStack STONE_LEGS;
    public static ItemStack STONE_BOOTS;

    public static void init()
    {
        // Create the wooden armor objects
        Armor_Items.createWoodHelm();
        Armor_Items.createWoodChest();
        Armor_Items.createWoodLegs();
        Armor_Items.createWoodBoots();

        // Create the stone armor objects
        Armor_Items.createStoneHelm();
        Armor_Items.createStoneChest();
        Armor_Items.createStoneLegs();
        Armor_Items.createStoneBoots();
    }

    // Wood Armor

    /**
     * Creates a wooden helmet over the vanilla leather helmet, giving it the same stats.
     */
    private static void createWoodHelm()
    {
        ItemStack woodHelm = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta woodHelmMeta = woodHelm.getItemMeta();


        if (woodHelmMeta != null)
        {
            woodHelmMeta.setDisplayName(ChatColor.AQUA + "Wood Helmet");

            AttributeModifier woodHelmArmorLevel = new AttributeModifier(UUID.randomUUID(),
                    "Wood Helm Modifier", LEATHER_HELM_ARMOR_POINTS - 0.5d,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);

            woodHelmMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, woodHelmArmorLevel);
        }

        woodHelm.setItemMeta(woodHelmMeta);

        Armor_Items.WOOD_HELM = woodHelm;

        // Recipe
        // The recipe is any wooden logs in the shape of a helmet
        ShapedRecipe woodHelmRecipe1 = new ShapedRecipe(NamespacedKey.minecraft("woodhelmone"), woodHelm);
        woodHelmRecipe1.shape("WWW"
                , "W W"
                , "   ");

        // We want any type of wooden logs to be used, and can be intermixed!
        woodHelmRecipe1.setIngredient('W', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS,
                Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.OAK_PLANKS,
                Material.SPRUCE_PLANKS));

        ShapedRecipe woodHelmRecipe2 = new ShapedRecipe(NamespacedKey.minecraft("woodhelmtwo"), woodHelm);
        woodHelmRecipe2.shape("   "
                , "WWW"
                , "W W");

        // We want any type of wooden logs to be used, and can be intermixed!
        woodHelmRecipe2.setIngredient('W', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS,
                Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.OAK_PLANKS,
                Material.SPRUCE_PLANKS));

        Bukkit.getServer().addRecipe(woodHelmRecipe1);
        Bukkit.getServer().addRecipe(woodHelmRecipe2);
    }

    /**
     * Creates a wooden chestplate over the vanilla leather chestplate, giving it the same stats.
     */
    private static void createWoodChest()
    {
        ItemStack woodChest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemMeta woodChestMeta = woodChest.getItemMeta();

        if (woodChestMeta != null)
        {
            woodChestMeta.setDisplayName(ChatColor.AQUA + "Wood Chestplate");

            AttributeModifier woodChestArmorLevel = new AttributeModifier(UUID.randomUUID(),
                    "Wood Chest Modifier", LEATHER_CHEST_ARMOR_POINTS + 0.5d,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);

            woodChestMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, woodChestArmorLevel);
        }

        woodChest.setItemMeta(woodChestMeta);

        Armor_Items.WOOD_CHEST = woodChest;

        // Recipe
        // The recipe is any wooden logs in the shape of a helmet
        ShapedRecipe woodChestRecipe = new ShapedRecipe(NamespacedKey.minecraft("woodchest"), woodChest);
        woodChestRecipe.shape("W W"
                , "WWW"
                , "WWW");

        // We want any type of wooden logs to be used, and can be intermixed!
        woodChestRecipe.setIngredient('W', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS,
                Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.OAK_PLANKS,
                Material.SPRUCE_PLANKS));

        Bukkit.getServer().addRecipe(woodChestRecipe);
    }

    /**
     * Creates wooden leggings over the vanilla leather leggings, giving it the same stats.
     */
    private static void createWoodLegs()
    {
        ItemStack woodLegs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemMeta woodLegsMeta = woodLegs.getItemMeta();

        if (woodLegsMeta != null)
        {
            woodLegsMeta.setDisplayName(ChatColor.AQUA + "Wood Leggings");

            AttributeModifier woodLegsArmorLevel = new AttributeModifier(UUID.randomUUID(),
                    "Wood Legs Modifier", LEATHER_LEGS_ARMOR_POINTS - 0.5d,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);

            woodLegsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, woodLegsArmorLevel);
        }

        woodLegs.setItemMeta(woodLegsMeta);

        Armor_Items.WOOD_LEGS = woodLegs;

        // Recipe
        // The recipe is any wooden logs in the shape of a helmet
        ShapedRecipe woodLegsRecipe = new ShapedRecipe(NamespacedKey.minecraft("woodlegs"), woodLegs);
        woodLegsRecipe.shape("WWW"
                , "W W"
                , "W W");

        // We want any type of wooden logs to be used, and can be intermixed!
        woodLegsRecipe.setIngredient('W', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS,
                Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.OAK_PLANKS,
                Material.SPRUCE_PLANKS));

        Bukkit.getServer().addRecipe(woodLegsRecipe);

    }

    /**
     * Creates wooden boots over the vanilla leather boots, giving it the same stats.
     */
    private static void createWoodBoots()
    {
        ItemStack woodBoots = new ItemStack(Material.LEATHER_BOOTS, 1);
        ItemMeta woodBootsMeta = woodBoots.getItemMeta();

        if (woodBootsMeta != null)
        {
            woodBootsMeta.setDisplayName(ChatColor.AQUA + "Wood Boots");

            AttributeModifier woodBootsArmorLevel = new AttributeModifier(UUID.randomUUID(),
                    "Wood Boots Modifier", LEATHER_BOOTS_ARMOR_POINTS + 0.5d,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);

            woodBootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, woodBootsArmorLevel);
        }

        woodBoots.setItemMeta(woodBootsMeta);

        Armor_Items.WOOD_BOOTS = woodBoots;

        // Recipe
        // The recipe is any wooden logs in the shape of a helmet
        ShapedRecipe woodBootsRecipe1 = new ShapedRecipe(NamespacedKey.minecraft("woodbootsone"), woodBoots);
        woodBootsRecipe1.shape("   "
                , "W W"
                , "W W");

        // We want any type of wooden logs to be used, and can be intermixed!
        woodBootsRecipe1.setIngredient('W', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS,
                Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.OAK_PLANKS,
                Material.SPRUCE_PLANKS));

        ShapedRecipe woodBootsRecipe2 = new ShapedRecipe(NamespacedKey.minecraft("woodbootstwo"), woodBoots);
        woodBootsRecipe2.shape("W W"
                , "W W"
                , "   ");

        // We want any type of wooden logs to be used, and can be intermixed!
        woodBootsRecipe2.setIngredient('W', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS,
                Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.OAK_PLANKS,
                Material.SPRUCE_PLANKS));

        Bukkit.getServer().addRecipe(woodBootsRecipe1);
        Bukkit.getServer().addRecipe(woodBootsRecipe2);
    }

    // Stone Armor

    /**
     * Creates a stone helmet over the vanilla chainmail helmet, giving it the same stats.
     */
    private static void createStoneHelm()
    {
        ItemStack stoneHelm = new ItemStack(Material.CHAINMAIL_HELMET, 1);
        ItemMeta stoneHelmMeta = stoneHelm.getItemMeta();

        if (stoneHelmMeta != null)
        {
            stoneHelmMeta.setDisplayName(ChatColor.AQUA + "Stone Helmet");

            AttributeModifier stoneHelmArmorLevel = new AttributeModifier(UUID.randomUUID(),
                    "Stone Helm Modifier", CHAINMAIL_HELM_ARMOR_POINTS + 0.5d,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);

            stoneHelmMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, stoneHelmArmorLevel);

            AttributeModifier stoneHelmArmorToughnessLevel = new AttributeModifier(UUID.randomUUID(),
                    "Stone Helm Toughness Modifier", 0.5d,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);

            stoneHelmMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, stoneHelmArmorToughnessLevel);
        }

        stoneHelm.setItemMeta(stoneHelmMeta);

        Armor_Items.STONE_HELM = stoneHelm;

        // Recipe
        // The recipe is any stone in the shape of a helmet
        ShapedRecipe stoneHelmRecipe1 = new ShapedRecipe(NamespacedKey.minecraft("stonehelmone"), stoneHelm);
        stoneHelmRecipe1.shape("SSS"
                , "S S"
                , "   ");

        // We want various types of stone-like things to be used and be intermixed!
        stoneHelmRecipe1.setIngredient('S', new RecipeChoice.MaterialChoice(Material.STONE, Material.ANDESITE,
                Material.DIORITE));

        ShapedRecipe stoneHelmRecipe2 = new ShapedRecipe(NamespacedKey.minecraft("stonehelmtwo"), stoneHelm);
        stoneHelmRecipe2.shape("   "
                , "SSS"
                , "S S");

        // We want various types of stone-like things to be used and be intermixed!
        stoneHelmRecipe2.setIngredient('S', new RecipeChoice.MaterialChoice(Material.STONE, Material.ANDESITE,
                Material.DIORITE));

        Bukkit.getServer().addRecipe(stoneHelmRecipe1);
        Bukkit.getServer().addRecipe(stoneHelmRecipe2);
    }

    /**
     * Creates a stone chestplate over the vanilla chainmail chestplate, giving it the same stats.
     */
    private static void createStoneChest()
    {
        ItemStack stoneChest = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
        ItemMeta stoneChestMeta = stoneChest.getItemMeta();

        if (stoneChestMeta != null)
        {
            stoneChestMeta.setDisplayName(ChatColor.AQUA + "Stone Chestplate");

            AttributeModifier stoneChestArmorLevel = new AttributeModifier(UUID.randomUUID(),
                    "Stone Chest Modifier", CHAINMAIL_CHEST_ARMOR_POINTS + 0.5d,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);

            stoneChestMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, stoneChestArmorLevel);

            AttributeModifier stoneChestArmorToughnessLevel = new AttributeModifier(UUID.randomUUID(),
                    "Stone Chest Toughness Modifier", 0.5d,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);

            stoneChestMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, stoneChestArmorToughnessLevel);
        }

        stoneChest.setItemMeta(stoneChestMeta);

        Armor_Items.STONE_CHEST = stoneChest;

        // Recipe
        // The recipe is any stone in the shape of a helmet
        ShapedRecipe stoneChestRecipe = new ShapedRecipe(NamespacedKey.minecraft("stonechest"), stoneChest);
        stoneChestRecipe.shape("S S"
                , "SSS"
                , "SSS");

        // We want various types of stone-like things to be used and be intermixed!
        stoneChestRecipe.setIngredient('S', new RecipeChoice.MaterialChoice(Material.STONE, Material.ANDESITE,
                Material.DIORITE));

        Bukkit.getServer().addRecipe(stoneChestRecipe);
    }

    /**
     * Creates stone leggings over the vanilla chainmail leggings, giving it the same stats.
     */
    private static void createStoneLegs()
    {
        ItemStack stoneLegs = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
        ItemMeta stoneLegsMeta = stoneLegs.getItemMeta();

        if (stoneLegsMeta != null)
        {
            stoneLegsMeta.setDisplayName(ChatColor.AQUA + "Stone Leggings");

            AttributeModifier stoneLegsArmorLevel = new AttributeModifier(UUID.randomUUID(),
                    "Stone Legs Modifier", CHAINMAIL_LEGS_ARMOR_POINTS + 0.5d,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);

            stoneLegsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, stoneLegsArmorLevel);

            AttributeModifier stoneLegsArmorToughnessLevel = new AttributeModifier(UUID.randomUUID(),
                    "Stone Legs Toughness Modifier", 0.5d,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);

            stoneLegsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, stoneLegsArmorToughnessLevel);
        }

        stoneLegs.setItemMeta(stoneLegsMeta);

        Armor_Items.STONE_LEGS = stoneLegs;

        // Recipe
        // The recipe is any stone in the shape of a Chestplate
        ShapedRecipe stoneLegsRecipe = new ShapedRecipe(NamespacedKey.minecraft("stonelegs"), stoneLegs);
        stoneLegsRecipe.shape("SSS"
                , "S S"
                , "S S");

        // We want various types of stone-like things to be used and be intermixed!
        stoneLegsRecipe.setIngredient('S', new RecipeChoice.MaterialChoice(Material.STONE, Material.ANDESITE,
                Material.DIORITE));

        Bukkit.getServer().addRecipe(stoneLegsRecipe);
    }

    /**
     * Creates stone boots over the vanilla chainmail leggings, giving it the same stats.
     */
    private static void createStoneBoots()
    {
        ItemStack stoneBoots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
        ItemMeta stoneBootsMeta = stoneBoots.getItemMeta();

        if (stoneBootsMeta != null)
        {
            stoneBootsMeta.setDisplayName(ChatColor.AQUA + "Stone Boots");

            AttributeModifier stoneBootsArmorLevel = new AttributeModifier(UUID.randomUUID(),
                    "Stone Boots Modifier", CHAINMAIL_BOOTS_ARMOR_POINTS + 0.5d,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);

            stoneBootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, stoneBootsArmorLevel);

            AttributeModifier stoneBootsArmorToughnessLevel = new AttributeModifier(UUID.randomUUID(),
                    "Stone Boots Toughness Modifier", 0.5d,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);

            stoneBootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, stoneBootsArmorToughnessLevel);
        }

        stoneBoots.setItemMeta(stoneBootsMeta);

        Armor_Items.STONE_BOOTS = stoneBoots;

        // Recipe
        // The recipe is any stone in the shape of boots
        ShapedRecipe stoneBootsRecipe1 = new ShapedRecipe(NamespacedKey.minecraft("stonebootsone"), stoneBoots);
        stoneBootsRecipe1.shape("   "
                , "S S"
                , "S S");

        // We want various types of stone-like things to be used and be intermixed!
        stoneBootsRecipe1.setIngredient('S', new RecipeChoice.MaterialChoice(Material.STONE, Material.ANDESITE,
                Material.DIORITE));

        ShapedRecipe stoneBootsRecipe2 = new ShapedRecipe(NamespacedKey.minecraft("stonebootstwo"), stoneBoots);
        stoneBootsRecipe2.shape("S S"
                , "S S"
                , "   ");

        // We want various types of stone-like things to be used and be intermixed!
        stoneBootsRecipe2.setIngredient('S', new RecipeChoice.MaterialChoice(Material.STONE, Material.ANDESITE,
                Material.DIORITE));

        Bukkit.getServer().addRecipe(stoneBootsRecipe1);
        Bukkit.getServer().addRecipe(stoneBootsRecipe2);
    }
}
