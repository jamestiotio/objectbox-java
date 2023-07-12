/*
 * Copyright 2023 ObjectBox Ltd. All rights reserved.
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

// automatically generated by the FlatBuffers compiler, do not modify

package io.objectbox.model;

/**
 * Basic type of a property
 */
@SuppressWarnings("unused")
public final class PropertyType {
  private PropertyType() { }
  /**
   * Not a real type, just best practice (e.g. forward compatibility)
   */
  public static final short Unknown = 0;
  /**
   * A boolean (flag)
   */
  public static final short Bool = 1;
  /**
   * 8-bit integer
   */
  public static final short Byte = 2;
  /**
   * 16-bit integer
   */
  public static final short Short = 3;
  /**
   * 16-bit character
   */
  public static final short Char = 4;
  /**
   * 32-bit integer
   */
  public static final short Int = 5;
  /**
   * 64-bit integer
   */
  public static final short Long = 6;
  /**
   * 32-bit floating point number
   */
  public static final short Float = 7;
  /**
   * 64-bit floating point number
   */
  public static final short Double = 8;
  /**
   * UTF-8 encoded string (variable length)
   */
  public static final short String = 9;
  /**
   * Date/time stored as a 64-bit (integer) timestamp representing milliseconds since 1970-01-01 (unix epoch)
   */
  public static final short Date = 10;
  /**
   * Relation to another entity
   */
  public static final short Relation = 11;
  /**
   * High precision date/time stored as a 64-bit timestamp representing nanoseconds since 1970-01-01 (unix epoch)
   */
  public static final short DateNano = 12;
  /**
   * "Flexible" type, which may contain scalars (integers, floating points), strings or containers (lists and maps).
   * Note: a flex map must use string keys.
   */
  public static final short Flex = 13;
  public static final short Reserved3 = 14;
  public static final short Reserved4 = 15;
  public static final short Reserved5 = 16;
  public static final short Reserved6 = 17;
  public static final short Reserved7 = 18;
  public static final short Reserved8 = 19;
  public static final short Reserved9 = 20;
  public static final short Reserved10 = 21;
  /**
   * Variable sized vector of Bool values (boolean; note: each value is represented as one byte)
   */
  public static final short BoolVector = 22;
  /**
   * Variable sized vector of Byte values (8-bit integers)
   */
  public static final short ByteVector = 23;
  /**
   * Variable sized vector of Short values (16-bit integers)
   */
  public static final short ShortVector = 24;
  /**
   * Variable sized vector of Char values (16-bit characters)
   */
  public static final short CharVector = 25;
  /**
   * Variable sized vector of Int values (32-bit integers)
   */
  public static final short IntVector = 26;
  /**
   * Variable sized vector of Long values (64-bit integers)
   */
  public static final short LongVector = 27;
  /**
   * Variable sized vector of Float values (32-bit floating point numbers)
   */
  public static final short FloatVector = 28;
  /**
   * Variable sized vector of Double values (64-bit floating point numbers)
   */
  public static final short DoubleVector = 29;
  /**
   * Variable sized vector of String values (UTF-8 encoded strings).
   */
  public static final short StringVector = 30;
  /**
   * Variable sized vector of Date values (64-bit timestamp).
   */
  public static final short DateVector = 31;
  /**
   * Variable sized vector of Date values (high precision 64-bit timestamp).
   */
  public static final short DateNanoVector = 32;

  public static final String[] names = { "Unknown", "Bool", "Byte", "Short", "Char", "Int", "Long", "Float", "Double", "String", "Date", "Relation", "DateNano", "Flex", "Reserved3", "Reserved4", "Reserved5", "Reserved6", "Reserved7", "Reserved8", "Reserved9", "Reserved10", "BoolVector", "ByteVector", "ShortVector", "CharVector", "IntVector", "LongVector", "FloatVector", "DoubleVector", "StringVector", "DateVector", "DateNanoVector", };

  public static String name(int e) { return names[e]; }
}

