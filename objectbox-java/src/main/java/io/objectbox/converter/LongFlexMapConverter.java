/*
 * Copyright 2020-2021 ObjectBox Ltd. All rights reserved.
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

package io.objectbox.converter;

/**
 * Used to automatically convert {@code Map<Long, V>}.
 */
public class LongFlexMapConverter extends FlexObjectConverter {

    @Override
    protected void checkMapKeyType(Object rawKey) {
        if (!(rawKey instanceof Long)) {
            throw new IllegalArgumentException("Map keys must be Long");
        }
    }

    @Override
    Object convertToKey(String keyValue) {
        return Long.valueOf(keyValue);
    }
}
