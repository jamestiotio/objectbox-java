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
 * Defines if and how the database is checked for valid key/value (KV) entries when opening it.
 */
@SuppressWarnings("unused")
public final class ValidateOnOpenModeKv {
  private ValidateOnOpenModeKv() { }
  /**
   * Not a real type, just best practice (e.g. forward compatibility).
   */
  public static final short Unknown = 0;
  /**
   * Performs standard checks.
   */
  public static final short Regular = 1;

  public static final String[] names = { "Unknown", "Regular", };

  public static String name(int e) { return names[e]; }
}

