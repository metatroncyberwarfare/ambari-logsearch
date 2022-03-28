/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.ambari.logsearch.config.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker for the shipper configuration properties.
 * Can be used to generate documentation about the shipper configs.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ShipperConfigElementDescription {

  /**
   * @return The path of the json element.
   */
  String path();

  /**
   * @return The type of the json element.
   */
  String type();

  /**
   * @return Describe what the json element is used for.
   */
  String description();

  /**
   * @return Example values for the element, if applicable.
   */
  String[] examples() default {};

  /**
   * @return Default value of the json element, if applicable.
   */
  String defaultValue() default "";

}
