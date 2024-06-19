// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerDieType.proto

package emu.grasscutter.net.proto;

public final class PlayerDieTypeOuterClass {
  private PlayerDieTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * 4.7.0
   * </pre>
   *
   * Protobuf enum {@code PlayerDieType}
   */
  public enum PlayerDieType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PLAYER_DIE_TYPE_NONE = 0;</code>
     */
    PLAYER_DIE_TYPE_NONE(0),
    /**
     * <code>PLAYER_DIE_TYPE_KILL_BY_MONSTER = 1;</code>
     */
    PLAYER_DIE_TYPE_KILL_BY_MONSTER(1),
    /**
     * <code>PLAYER_DIE_TYPE_KILL_BY_GEAR = 2;</code>
     */
    PLAYER_DIE_TYPE_KILL_BY_GEAR(2),
    /**
     * <code>PLAYER_DIE_TYPE_FALL = 3;</code>
     */
    PLAYER_DIE_TYPE_FALL(3),
    /**
     * <code>PLAYER_DIE_TYPE_DRAWN = 4;</code>
     */
    PLAYER_DIE_TYPE_DRAWN(4),
    /**
     * <code>PLAYER_DIE_TYPE_ABYSS = 5;</code>
     */
    PLAYER_DIE_TYPE_ABYSS(5),
    /**
     * <code>PLAYER_DIE_TYPE_GM = 6;</code>
     */
    PLAYER_DIE_TYPE_GM(6),
    /**
     * <code>PLAYER_DIE_TYPE_CLIMATE_COLD = 7;</code>
     */
    PLAYER_DIE_TYPE_CLIMATE_COLD(7),
    /**
     * <code>PLAYER_DIE_TYPE_STORM_LIGHTING = 8;</code>
     */
    PLAYER_DIE_TYPE_STORM_LIGHTING(8),
    /**
     * <code>PLAYER_DIE_DIRTY_WATER_EROSION = 9;</code>
     */
    PLAYER_DIE_DIRTY_WATER_EROSION(9),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PLAYER_DIE_TYPE_NONE = 0;</code>
     */
    public static final int PLAYER_DIE_TYPE_NONE_VALUE = 0;
    /**
     * <code>PLAYER_DIE_TYPE_KILL_BY_MONSTER = 1;</code>
     */
    public static final int PLAYER_DIE_TYPE_KILL_BY_MONSTER_VALUE = 1;
    /**
     * <code>PLAYER_DIE_TYPE_KILL_BY_GEAR = 2;</code>
     */
    public static final int PLAYER_DIE_TYPE_KILL_BY_GEAR_VALUE = 2;
    /**
     * <code>PLAYER_DIE_TYPE_FALL = 3;</code>
     */
    public static final int PLAYER_DIE_TYPE_FALL_VALUE = 3;
    /**
     * <code>PLAYER_DIE_TYPE_DRAWN = 4;</code>
     */
    public static final int PLAYER_DIE_TYPE_DRAWN_VALUE = 4;
    /**
     * <code>PLAYER_DIE_TYPE_ABYSS = 5;</code>
     */
    public static final int PLAYER_DIE_TYPE_ABYSS_VALUE = 5;
    /**
     * <code>PLAYER_DIE_TYPE_GM = 6;</code>
     */
    public static final int PLAYER_DIE_TYPE_GM_VALUE = 6;
    /**
     * <code>PLAYER_DIE_TYPE_CLIMATE_COLD = 7;</code>
     */
    public static final int PLAYER_DIE_TYPE_CLIMATE_COLD_VALUE = 7;
    /**
     * <code>PLAYER_DIE_TYPE_STORM_LIGHTING = 8;</code>
     */
    public static final int PLAYER_DIE_TYPE_STORM_LIGHTING_VALUE = 8;
    /**
     * <code>PLAYER_DIE_DIRTY_WATER_EROSION = 9;</code>
     */
    public static final int PLAYER_DIE_DIRTY_WATER_EROSION_VALUE = 9;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PlayerDieType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PlayerDieType forNumber(int value) {
      switch (value) {
        case 0: return PLAYER_DIE_TYPE_NONE;
        case 1: return PLAYER_DIE_TYPE_KILL_BY_MONSTER;
        case 2: return PLAYER_DIE_TYPE_KILL_BY_GEAR;
        case 3: return PLAYER_DIE_TYPE_FALL;
        case 4: return PLAYER_DIE_TYPE_DRAWN;
        case 5: return PLAYER_DIE_TYPE_ABYSS;
        case 6: return PLAYER_DIE_TYPE_GM;
        case 7: return PLAYER_DIE_TYPE_CLIMATE_COLD;
        case 8: return PLAYER_DIE_TYPE_STORM_LIGHTING;
        case 9: return PLAYER_DIE_DIRTY_WATER_EROSION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PlayerDieType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PlayerDieType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PlayerDieType>() {
            public PlayerDieType findValueByNumber(int number) {
              return PlayerDieType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerDieTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final PlayerDieType[] VALUES = values();

    public static PlayerDieType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PlayerDieType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:PlayerDieType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023PlayerDieType.proto*\302\002\n\rPlayerDieType\022" +
      "\030\n\024PLAYER_DIE_TYPE_NONE\020\000\022#\n\037PLAYER_DIE_" +
      "TYPE_KILL_BY_MONSTER\020\001\022 \n\034PLAYER_DIE_TYP" +
      "E_KILL_BY_GEAR\020\002\022\030\n\024PLAYER_DIE_TYPE_FALL" +
      "\020\003\022\031\n\025PLAYER_DIE_TYPE_DRAWN\020\004\022\031\n\025PLAYER_" +
      "DIE_TYPE_ABYSS\020\005\022\026\n\022PLAYER_DIE_TYPE_GM\020\006" +
      "\022 \n\034PLAYER_DIE_TYPE_CLIMATE_COLD\020\007\022\"\n\036PL" +
      "AYER_DIE_TYPE_STORM_LIGHTING\020\010\022\"\n\036PLAYER" +
      "_DIE_DIRTY_WATER_EROSION\020\tB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
