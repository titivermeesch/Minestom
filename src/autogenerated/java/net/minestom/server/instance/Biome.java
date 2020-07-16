//==============================
//  AUTOGENERATED BY EnumGenerator
//==============================
package net.minestom.server.instance;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;
@SuppressWarnings({"deprecation"})

public enum Biome {
	OCEAN("minecraft:ocean", 0),
	PLAINS("minecraft:plains", 1),
	DESERT("minecraft:desert", 2),
	MOUNTAINS("minecraft:mountains", 3),
	FOREST("minecraft:forest", 4),
	TAIGA("minecraft:taiga", 5),
	SWAMP("minecraft:swamp", 6),
	RIVER("minecraft:river", 7),
	NETHER_WASTES("minecraft:nether_wastes", 8),
	THE_END("minecraft:the_end", 9),
	FROZEN_OCEAN("minecraft:frozen_ocean", 10),
	FROZEN_RIVER("minecraft:frozen_river", 11),
	SNOWY_TUNDRA("minecraft:snowy_tundra", 12),
	SNOWY_MOUNTAINS("minecraft:snowy_mountains", 13),
	MUSHROOM_FIELDS("minecraft:mushroom_fields", 14),
	MUSHROOM_FIELD_SHORE("minecraft:mushroom_field_shore", 15),
	BEACH("minecraft:beach", 16),
	DESERT_HILLS("minecraft:desert_hills", 17),
	WOODED_HILLS("minecraft:wooded_hills", 18),
	TAIGA_HILLS("minecraft:taiga_hills", 19),
	MOUNTAIN_EDGE("minecraft:mountain_edge", 20),
	JUNGLE("minecraft:jungle", 21),
	JUNGLE_HILLS("minecraft:jungle_hills", 22),
	JUNGLE_EDGE("minecraft:jungle_edge", 23),
	DEEP_OCEAN("minecraft:deep_ocean", 24),
	STONE_SHORE("minecraft:stone_shore", 25),
	SNOWY_BEACH("minecraft:snowy_beach", 26),
	BIRCH_FOREST("minecraft:birch_forest", 27),
	BIRCH_FOREST_HILLS("minecraft:birch_forest_hills", 28),
	DARK_FOREST("minecraft:dark_forest", 29),
	SNOWY_TAIGA("minecraft:snowy_taiga", 30),
	SNOWY_TAIGA_HILLS("minecraft:snowy_taiga_hills", 31),
	GIANT_TREE_TAIGA("minecraft:giant_tree_taiga", 32),
	GIANT_TREE_TAIGA_HILLS("minecraft:giant_tree_taiga_hills", 33),
	WOODED_MOUNTAINS("minecraft:wooded_mountains", 34),
	SAVANNA("minecraft:savanna", 35),
	SAVANNA_PLATEAU("minecraft:savanna_plateau", 36),
	BADLANDS("minecraft:badlands", 37),
	WOODED_BADLANDS_PLATEAU("minecraft:wooded_badlands_plateau", 38),
	BADLANDS_PLATEAU("minecraft:badlands_plateau", 39),
	SMALL_END_ISLANDS("minecraft:small_end_islands", 40),
	END_MIDLANDS("minecraft:end_midlands", 41),
	END_HIGHLANDS("minecraft:end_highlands", 42),
	END_BARRENS("minecraft:end_barrens", 43),
	WARM_OCEAN("minecraft:warm_ocean", 44),
	LUKEWARM_OCEAN("minecraft:lukewarm_ocean", 45),
	COLD_OCEAN("minecraft:cold_ocean", 46),
	DEEP_WARM_OCEAN("minecraft:deep_warm_ocean", 47),
	DEEP_LUKEWARM_OCEAN("minecraft:deep_lukewarm_ocean", 48),
	DEEP_COLD_OCEAN("minecraft:deep_cold_ocean", 49),
	DEEP_FROZEN_OCEAN("minecraft:deep_frozen_ocean", 50),
	THE_VOID("minecraft:the_void", 127),
	SUNFLOWER_PLAINS("minecraft:sunflower_plains", 129),
	DESERT_LAKES("minecraft:desert_lakes", 130),
	GRAVELLY_MOUNTAINS("minecraft:gravelly_mountains", 131),
	FLOWER_FOREST("minecraft:flower_forest", 132),
	TAIGA_MOUNTAINS("minecraft:taiga_mountains", 133),
	SWAMP_HILLS("minecraft:swamp_hills", 134),
	ICE_SPIKES("minecraft:ice_spikes", 140),
	MODIFIED_JUNGLE("minecraft:modified_jungle", 149),
	MODIFIED_JUNGLE_EDGE("minecraft:modified_jungle_edge", 151),
	TALL_BIRCH_FOREST("minecraft:tall_birch_forest", 155),
	TALL_BIRCH_HILLS("minecraft:tall_birch_hills", 156),
	DARK_FOREST_HILLS("minecraft:dark_forest_hills", 157),
	SNOWY_TAIGA_MOUNTAINS("minecraft:snowy_taiga_mountains", 158),
	GIANT_SPRUCE_TAIGA("minecraft:giant_spruce_taiga", 160),
	GIANT_SPRUCE_TAIGA_HILLS("minecraft:giant_spruce_taiga_hills", 161),
	MODIFIED_GRAVELLY_MOUNTAINS("minecraft:modified_gravelly_mountains", 162),
	SHATTERED_SAVANNA("minecraft:shattered_savanna", 163),
	SHATTERED_SAVANNA_PLATEAU("minecraft:shattered_savanna_plateau", 164),
	ERODED_BADLANDS("minecraft:eroded_badlands", 165),
	MODIFIED_WOODED_BADLANDS_PLATEAU("minecraft:modified_wooded_badlands_plateau", 166),
	MODIFIED_BADLANDS_PLATEAU("minecraft:modified_badlands_plateau", 167),
	BAMBOO_JUNGLE("minecraft:bamboo_jungle", 168),
	BAMBOO_JUNGLE_HILLS("minecraft:bamboo_jungle_hills", 169),
	SOUL_SAND_VALLEY("minecraft:soul_sand_valley", 170),
	CRIMSON_FOREST("minecraft:crimson_forest", 171),
	WARPED_FOREST("minecraft:warped_forest", 172),
	BASALT_DELTAS("minecraft:basalt_deltas", 173),
;
	private String namespaceID;
	private int id;

	Biome(String namespaceID, int id) {
		this.namespaceID = namespaceID;
		this.id = id;
		Registries.biomes.put(NamespaceID.from(namespaceID), this);
	}

	public int getId() {
		return id;
	}

	public String getNamespaceID() {
		return namespaceID;
	}

	public static Biome fromId(int id) {
		for(Biome o : values()) {
			if(o.getId() == id) {
				return o;
			}
		}
		return null;
	}
}