/*
 * Copyright 2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may
 * not use this file except in compliance with the License. A copy of the
 * License is located at
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "LICENSE" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.blox.dataservice.model;

import java.util.StringJoiner;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
// required for builder
@AllArgsConstructor
// required for mapstruct
@NoArgsConstructor
public class Cluster {
  private static final String UNDERSCORE = "_";

  @NonNull private String accountId;
  @NonNull private String clusterName;

  public String generateAccountIdCluster() {
    return new StringJoiner(UNDERSCORE).add(accountId).add(clusterName).toString();
  }
}