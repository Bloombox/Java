// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/User.proto

package io.bloombox.schema.identity;

public interface MenuPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.MenuPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Preferred menu sections or product types.
   * </pre>
   *
   * <code>repeated .products.menu.section.Section section = 1;</code>
   */
  java.util.List<io.bloombox.schema.menu.section.Section> getSectionList();
  /**
   * <pre>
   * Preferred menu sections or product types.
   * </pre>
   *
   * <code>repeated .products.menu.section.Section section = 1;</code>
   */
  int getSectionCount();
  /**
   * <pre>
   * Preferred menu sections or product types.
   * </pre>
   *
   * <code>repeated .products.menu.section.Section section = 1;</code>
   */
  io.bloombox.schema.menu.section.Section getSection(int index);
  /**
   * <pre>
   * Preferred menu sections or product types.
   * </pre>
   *
   * <code>repeated .products.menu.section.Section section = 1;</code>
   */
  java.util.List<java.lang.Integer>
  getSectionValueList();
  /**
   * <pre>
   * Preferred menu sections or product types.
   * </pre>
   *
   * <code>repeated .products.menu.section.Section section = 1;</code>
   */
  int getSectionValue(int index);

  /**
   * <pre>
   * Preferred feelings or experiential states.
   * </pre>
   *
   * <code>repeated .structs.labtesting.Feeling feeling = 2;</code>
   */
  java.util.List<io.bloombox.schema.product.struct.testing.Feeling> getFeelingList();
  /**
   * <pre>
   * Preferred feelings or experiential states.
   * </pre>
   *
   * <code>repeated .structs.labtesting.Feeling feeling = 2;</code>
   */
  int getFeelingCount();
  /**
   * <pre>
   * Preferred feelings or experiential states.
   * </pre>
   *
   * <code>repeated .structs.labtesting.Feeling feeling = 2;</code>
   */
  io.bloombox.schema.product.struct.testing.Feeling getFeeling(int index);
  /**
   * <pre>
   * Preferred feelings or experiential states.
   * </pre>
   *
   * <code>repeated .structs.labtesting.Feeling feeling = 2;</code>
   */
  java.util.List<java.lang.Integer>
  getFeelingValueList();
  /**
   * <pre>
   * Preferred feelings or experiential states.
   * </pre>
   *
   * <code>repeated .structs.labtesting.Feeling feeling = 2;</code>
   */
  int getFeelingValue(int index);

  /**
   * <pre>
   * Preferred tasting notes.
   * </pre>
   *
   * <code>repeated .structs.labtesting.TasteNote taste_note = 3;</code>
   */
  java.util.List<io.bloombox.schema.product.struct.testing.TasteNote> getTasteNoteList();
  /**
   * <pre>
   * Preferred tasting notes.
   * </pre>
   *
   * <code>repeated .structs.labtesting.TasteNote taste_note = 3;</code>
   */
  int getTasteNoteCount();
  /**
   * <pre>
   * Preferred tasting notes.
   * </pre>
   *
   * <code>repeated .structs.labtesting.TasteNote taste_note = 3;</code>
   */
  io.bloombox.schema.product.struct.testing.TasteNote getTasteNote(int index);
  /**
   * <pre>
   * Preferred tasting notes.
   * </pre>
   *
   * <code>repeated .structs.labtesting.TasteNote taste_note = 3;</code>
   */
  java.util.List<java.lang.Integer>
  getTasteNoteValueList();
  /**
   * <pre>
   * Preferred tasting notes.
   * </pre>
   *
   * <code>repeated .structs.labtesting.TasteNote taste_note = 3;</code>
   */
  int getTasteNoteValue(int index);

  /**
   * <pre>
   * Desired potency level.
   * </pre>
   *
   * <code>.structs.labtesting.PotencyEstimate desired_potency = 4;</code>
   */
  int getDesiredPotencyValue();
  /**
   * <pre>
   * Desired potency level.
   * </pre>
   *
   * <code>.structs.labtesting.PotencyEstimate desired_potency = 4;</code>
   */
  io.bloombox.schema.product.struct.testing.PotencyEstimate getDesiredPotency();

  /**
   * <pre>
   * Desired cannabinoid ratio.
   * </pre>
   *
   * <code>.structs.labtesting.CannabinoidRatio cannabinoid_ratio = 5;</code>
   */
  int getCannabinoidRatioValue();
  /**
   * <pre>
   * Desired cannabinoid ratio.
   * </pre>
   *
   * <code>.structs.labtesting.CannabinoidRatio cannabinoid_ratio = 5;</code>
   */
  io.bloombox.schema.product.struct.testing.CannabinoidRatio getCannabinoidRatio();

  /**
   * <pre>
   * Preferred species types.
   * </pre>
   *
   * <code>repeated .structs.Species species = 6;</code>
   */
  java.util.List<io.bloombox.schema.product.struct.Species> getSpeciesList();
  /**
   * <pre>
   * Preferred species types.
   * </pre>
   *
   * <code>repeated .structs.Species species = 6;</code>
   */
  int getSpeciesCount();
  /**
   * <pre>
   * Preferred species types.
   * </pre>
   *
   * <code>repeated .structs.Species species = 6;</code>
   */
  io.bloombox.schema.product.struct.Species getSpecies(int index);
  /**
   * <pre>
   * Preferred species types.
   * </pre>
   *
   * <code>repeated .structs.Species species = 6;</code>
   */
  java.util.List<java.lang.Integer>
  getSpeciesValueList();
  /**
   * <pre>
   * Preferred species types.
   * </pre>
   *
   * <code>repeated .structs.Species species = 6;</code>
   */
  int getSpeciesValue(int index);

  /**
   * <pre>
   * Preferred grow types.
   * </pre>
   *
   * <code>repeated .structs.Grow grow = 7;</code>
   */
  java.util.List<io.bloombox.schema.product.struct.Grow> getGrowList();
  /**
   * <pre>
   * Preferred grow types.
   * </pre>
   *
   * <code>repeated .structs.Grow grow = 7;</code>
   */
  int getGrowCount();
  /**
   * <pre>
   * Preferred grow types.
   * </pre>
   *
   * <code>repeated .structs.Grow grow = 7;</code>
   */
  io.bloombox.schema.product.struct.Grow getGrow(int index);
  /**
   * <pre>
   * Preferred grow types.
   * </pre>
   *
   * <code>repeated .structs.Grow grow = 7;</code>
   */
  java.util.List<java.lang.Integer>
  getGrowValueList();
  /**
   * <pre>
   * Preferred grow types.
   * </pre>
   *
   * <code>repeated .structs.Grow grow = 7;</code>
   */
  int getGrowValue(int index);
}
