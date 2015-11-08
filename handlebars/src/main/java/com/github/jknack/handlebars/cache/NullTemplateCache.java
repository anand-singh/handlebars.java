/**
 * Copyright (c) 2012-2015 Edgar Espina
 *
 * This file is part of Handlebars.java.
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
package com.github.jknack.handlebars.cache;

import java.io.IOException;

import com.github.jknack.handlebars.Parser;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.TemplateSource;

/**
 * Null cache implementation.
 *
 * @author edgar.espina
 * @since 0.11.0
 */
public enum NullTemplateCache implements TemplateCache {

  /**
   * Shared instance of null cache.
   */
  INSTANCE;

  @Override
  public void clear() {
  }

  @Override
  public void evict(final TemplateSource source) {
  }

  @Override
  public NullTemplateCache setReload(final boolean reload) {
    return this;
  }

  @Override
  public Template get(final TemplateSource source, final Parser parser) throws IOException {
    return parser.parse(source);
  }

}
