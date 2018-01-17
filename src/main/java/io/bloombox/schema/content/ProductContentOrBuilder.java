/*
 * Copyright 2018, Bloombox, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: content/ProductContent.proto

package io.bloombox.schema.content;

public interface ProductContentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:content.ProductContent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Main product name.
   * </pre>
   *
   * <code>.content.Name name = 1;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Main product name.
   * </pre>
   *
   * <code>.content.Name name = 1;</code>
   */
  io.bloombox.schema.content.Name getName();
  /**
   * <pre>
   * Main product name.
   * </pre>
   *
   * <code>.content.Name name = 1;</code>
   */
  io.bloombox.schema.content.NameOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Brand information for this product.
   * </pre>
   *
   * <code>.content.Brand brand = 2;</code>
   */
  boolean hasBrand();
  /**
   * <pre>
   * Brand information for this product.
   * </pre>
   *
   * <code>.content.Brand brand = 2;</code>
   */
  io.bloombox.schema.content.Brand getBrand();
  /**
   * <pre>
   * Brand information for this product.
   * </pre>
   *
   * <code>.content.Brand brand = 2;</code>
   */
  io.bloombox.schema.content.BrandOrBuilder getBrandOrBuilder();

  /**
   * <pre>
   * Description or narrative-style content about this product.
   * </pre>
   *
   * <code>.content.Content summary = 3;</code>
   */
  boolean hasSummary();
  /**
   * <pre>
   * Description or narrative-style content about this product.
   * </pre>
   *
   * <code>.content.Content summary = 3;</code>
   */
  io.bloombox.schema.content.Content getSummary();
  /**
   * <pre>
   * Description or narrative-style content about this product.
   * </pre>
   *
   * <code>.content.Content summary = 3;</code>
   */
  io.bloombox.schema.content.ContentOrBuilder getSummaryOrBuilder();

  /**
   * <pre>
   * Content about how this product is best used, or recommended to be used, either from the manufacturer or retailer.
   * </pre>
   *
   * <code>.content.Content usage = 4;</code>
   */
  boolean hasUsage();
  /**
   * <pre>
   * Content about how this product is best used, or recommended to be used, either from the manufacturer or retailer.
   * </pre>
   *
   * <code>.content.Content usage = 4;</code>
   */
  io.bloombox.schema.content.Content getUsage();
  /**
   * <pre>
   * Content about how this product is best used, or recommended to be used, either from the manufacturer or retailer.
   * </pre>
   *
   * <code>.content.Content usage = 4;</code>
   */
  io.bloombox.schema.content.ContentOrBuilder getUsageOrBuilder();

  /**
   * <pre>
   * Dosage advice about this product, either from the manufacturer or retailer.
   * </pre>
   *
   * <code>.content.Content dosage = 5;</code>
   */
  boolean hasDosage();
  /**
   * <pre>
   * Dosage advice about this product, either from the manufacturer or retailer.
   * </pre>
   *
   * <code>.content.Content dosage = 5;</code>
   */
  io.bloombox.schema.content.Content getDosage();
  /**
   * <pre>
   * Dosage advice about this product, either from the manufacturer or retailer.
   * </pre>
   *
   * <code>.content.Content dosage = 5;</code>
   */
  io.bloombox.schema.content.ContentOrBuilder getDosageOrBuilder();

  /**
   * <pre>
   * Product media, including images, videos, and so on.
   * </pre>
   *
   * <code>repeated .media.MediaItem media = 6;</code>
   */
  java.util.List<io.bloombox.schema.media.MediaItem> 
      getMediaList();
  /**
   * <pre>
   * Product media, including images, videos, and so on.
   * </pre>
   *
   * <code>repeated .media.MediaItem media = 6;</code>
   */
  io.bloombox.schema.media.MediaItem getMedia(int index);
  /**
   * <pre>
   * Product media, including images, videos, and so on.
   * </pre>
   *
   * <code>repeated .media.MediaItem media = 6;</code>
   */
  int getMediaCount();
  /**
   * <pre>
   * Product media, including images, videos, and so on.
   * </pre>
   *
   * <code>repeated .media.MediaItem media = 6;</code>
   */
  java.util.List<? extends io.bloombox.schema.media.MediaItemOrBuilder> 
      getMediaOrBuilderList();
  /**
   * <pre>
   * Product media, including images, videos, and so on.
   * </pre>
   *
   * <code>repeated .media.MediaItem media = 6;</code>
   */
  io.bloombox.schema.media.MediaItemOrBuilder getMediaOrBuilder(
      int index);

  /**
   * <pre>
   * Pricing specification for this product, regardless of pricing type (i.e. weighted or unit-style pricing).
   * </pre>
   *
   * <code>.structs.pricing.ProductPricing pricing = 7;</code>
   */
  boolean hasPricing();
  /**
   * <pre>
   * Pricing specification for this product, regardless of pricing type (i.e. weighted or unit-style pricing).
   * </pre>
   *
   * <code>.structs.pricing.ProductPricing pricing = 7;</code>
   */
  io.bloombox.schema.product.struct.ProductPricing getPricing();
  /**
   * <pre>
   * Pricing specification for this product, regardless of pricing type (i.e. weighted or unit-style pricing).
   * </pre>
   *
   * <code>.structs.pricing.ProductPricing pricing = 7;</code>
   */
  io.bloombox.schema.product.struct.ProductPricingOrBuilder getPricingOrBuilder();

  /**
   * <pre>
   * Lab testing information concerning this product.
   * </pre>
   *
   * <code>.structs.labtesting.TestResults testing = 8;</code>
   */
  boolean hasTesting();
  /**
   * <pre>
   * Lab testing information concerning this product.
   * </pre>
   *
   * <code>.structs.labtesting.TestResults testing = 8;</code>
   */
  io.bloombox.schema.product.struct.testing.TestResults getTesting();
  /**
   * <pre>
   * Lab testing information concerning this product.
   * </pre>
   *
   * <code>.structs.labtesting.TestResults testing = 8;</code>
   */
  io.bloombox.schema.product.struct.testing.TestResultsOrBuilder getTestingOrBuilder();

  /**
   * <pre>
   * Product flags attached to this content.
   * </pre>
   *
   * <code>repeated .structs.ProductFlag flags = 9;</code>
   */
  java.util.List<io.bloombox.schema.product.struct.ProductFlag> getFlagsList();
  /**
   * <pre>
   * Product flags attached to this content.
   * </pre>
   *
   * <code>repeated .structs.ProductFlag flags = 9;</code>
   */
  int getFlagsCount();
  /**
   * <pre>
   * Product flags attached to this content.
   * </pre>
   *
   * <code>repeated .structs.ProductFlag flags = 9;</code>
   */
  io.bloombox.schema.product.struct.ProductFlag getFlags(int index);
  /**
   * <pre>
   * Product flags attached to this content.
   * </pre>
   *
   * <code>repeated .structs.ProductFlag flags = 9;</code>
   */
  java.util.List<java.lang.Integer>
  getFlagsValueList();
  /**
   * <pre>
   * Product flags attached to this content.
   * </pre>
   *
   * <code>repeated .structs.ProductFlag flags = 9;</code>
   */
  int getFlagsValue(int index);

  /**
   * <pre>
   * Timestamps for this product.
   * </pre>
   *
   * <code>.content.ProductTimestamps ts = 10;</code>
   */
  boolean hasTs();
  /**
   * <pre>
   * Timestamps for this product.
   * </pre>
   *
   * <code>.content.ProductTimestamps ts = 10;</code>
   */
  io.bloombox.schema.content.ProductTimestamps getTs();
  /**
   * <pre>
   * Timestamps for this product.
   * </pre>
   *
   * <code>.content.ProductTimestamps ts = 10;</code>
   */
  io.bloombox.schema.content.ProductTimestampsOrBuilder getTsOrBuilder();
}
