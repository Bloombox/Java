// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/User.proto

package io.bloombox.schema.identity;

public interface MenuPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.identity.MenuPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Preferred menu sections or product types.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 1 [(.gen_bq_schema.description) = "Preferred menu sections or product types."];</code>
   */
  java.util.List<io.opencannabis.schema.menu.section.Section> getSectionList();
  /**
   * <pre>
   * Preferred menu sections or product types.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 1 [(.gen_bq_schema.description) = "Preferred menu sections or product types."];</code>
   */
  int getSectionCount();
  /**
   * <pre>
   * Preferred menu sections or product types.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 1 [(.gen_bq_schema.description) = "Preferred menu sections or product types."];</code>
   */
  io.opencannabis.schema.menu.section.Section getSection(int index);
  /**
   * <pre>
   * Preferred menu sections or product types.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 1 [(.gen_bq_schema.description) = "Preferred menu sections or product types."];</code>
   */
  java.util.List<java.lang.Integer>
  getSectionValueList();
  /**
   * <pre>
   * Preferred menu sections or product types.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 1 [(.gen_bq_schema.description) = "Preferred menu sections or product types."];</code>
   */
  int getSectionValue(int index);

  /**
   * <pre>
   * Preferred feelings or experiential states.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.Feeling feeling = 2 [(.gen_bq_schema.description) = "Preferred feelings or experiential states."];</code>
   */
  java.util.List<io.opencannabis.schema.product.struct.testing.Feeling> getFeelingList();
  /**
   * <pre>
   * Preferred feelings or experiential states.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.Feeling feeling = 2 [(.gen_bq_schema.description) = "Preferred feelings or experiential states."];</code>
   */
  int getFeelingCount();
  /**
   * <pre>
   * Preferred feelings or experiential states.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.Feeling feeling = 2 [(.gen_bq_schema.description) = "Preferred feelings or experiential states."];</code>
   */
  io.opencannabis.schema.product.struct.testing.Feeling getFeeling(int index);
  /**
   * <pre>
   * Preferred feelings or experiential states.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.Feeling feeling = 2 [(.gen_bq_schema.description) = "Preferred feelings or experiential states."];</code>
   */
  java.util.List<java.lang.Integer>
  getFeelingValueList();
  /**
   * <pre>
   * Preferred feelings or experiential states.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.Feeling feeling = 2 [(.gen_bq_schema.description) = "Preferred feelings or experiential states."];</code>
   */
  int getFeelingValue(int index);

  /**
   * <pre>
   * Preferred tasting notes.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.TasteNote taste_note = 3 [(.gen_bq_schema.description) = "Preferred tasting notes."];</code>
   */
  java.util.List<io.opencannabis.schema.product.struct.testing.TasteNote> getTasteNoteList();
  /**
   * <pre>
   * Preferred tasting notes.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.TasteNote taste_note = 3 [(.gen_bq_schema.description) = "Preferred tasting notes."];</code>
   */
  int getTasteNoteCount();
  /**
   * <pre>
   * Preferred tasting notes.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.TasteNote taste_note = 3 [(.gen_bq_schema.description) = "Preferred tasting notes."];</code>
   */
  io.opencannabis.schema.product.struct.testing.TasteNote getTasteNote(int index);
  /**
   * <pre>
   * Preferred tasting notes.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.TasteNote taste_note = 3 [(.gen_bq_schema.description) = "Preferred tasting notes."];</code>
   */
  java.util.List<java.lang.Integer>
  getTasteNoteValueList();
  /**
   * <pre>
   * Preferred tasting notes.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.labtesting.TasteNote taste_note = 3 [(.gen_bq_schema.description) = "Preferred tasting notes."];</code>
   */
  int getTasteNoteValue(int index);

  /**
   * <pre>
   * Desired potency level.
   * </pre>
   *
   * <code>.opencannabis.structs.labtesting.PotencyEstimate desired_potency = 4 [(.gen_bq_schema.description) = "Desired potency level."];</code>
   */
  int getDesiredPotencyValue();
  /**
   * <pre>
   * Desired potency level.
   * </pre>
   *
   * <code>.opencannabis.structs.labtesting.PotencyEstimate desired_potency = 4 [(.gen_bq_schema.description) = "Desired potency level."];</code>
   */
  io.opencannabis.schema.product.struct.testing.PotencyEstimate getDesiredPotency();

  /**
   * <pre>
   * Desired cannabinoid ratio.
   * </pre>
   *
   * <code>.opencannabis.structs.labtesting.CannabinoidRatio cannabinoid_ratio = 5 [(.gen_bq_schema.description) = "Desired cannabinoid ratio."];</code>
   */
  int getCannabinoidRatioValue();
  /**
   * <pre>
   * Desired cannabinoid ratio.
   * </pre>
   *
   * <code>.opencannabis.structs.labtesting.CannabinoidRatio cannabinoid_ratio = 5 [(.gen_bq_schema.description) = "Desired cannabinoid ratio."];</code>
   */
  io.opencannabis.schema.product.struct.testing.CannabinoidRatio getCannabinoidRatio();

  /**
   * <pre>
   * Preferred species types.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.Species species = 6 [(.gen_bq_schema.description) = "Preferred species types."];</code>
   */
  java.util.List<io.opencannabis.schema.product.struct.Species> getSpeciesList();
  /**
   * <pre>
   * Preferred species types.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.Species species = 6 [(.gen_bq_schema.description) = "Preferred species types."];</code>
   */
  int getSpeciesCount();
  /**
   * <pre>
   * Preferred species types.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.Species species = 6 [(.gen_bq_schema.description) = "Preferred species types."];</code>
   */
  io.opencannabis.schema.product.struct.Species getSpecies(int index);
  /**
   * <pre>
   * Preferred species types.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.Species species = 6 [(.gen_bq_schema.description) = "Preferred species types."];</code>
   */
  java.util.List<java.lang.Integer>
  getSpeciesValueList();
  /**
   * <pre>
   * Preferred species types.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.Species species = 6 [(.gen_bq_schema.description) = "Preferred species types."];</code>
   */
  int getSpeciesValue(int index);

  /**
   * <pre>
   * Preferred grow types.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.Grow grow = 7 [(.gen_bq_schema.description) = "Preferred grow types."];</code>
   */
  java.util.List<io.opencannabis.schema.product.struct.Grow> getGrowList();
  /**
   * <pre>
   * Preferred grow types.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.Grow grow = 7 [(.gen_bq_schema.description) = "Preferred grow types."];</code>
   */
  int getGrowCount();
  /**
   * <pre>
   * Preferred grow types.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.Grow grow = 7 [(.gen_bq_schema.description) = "Preferred grow types."];</code>
   */
  io.opencannabis.schema.product.struct.Grow getGrow(int index);
  /**
   * <pre>
   * Preferred grow types.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.Grow grow = 7 [(.gen_bq_schema.description) = "Preferred grow types."];</code>
   */
  java.util.List<java.lang.Integer>
  getGrowValueList();
  /**
   * <pre>
   * Preferred grow types.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.Grow grow = 7 [(.gen_bq_schema.description) = "Preferred grow types."];</code>
   */
  int getGrowValue(int index);
}
