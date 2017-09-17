/*
 * Copyright (C) 2012 Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.swift.generator.template;

/**
 * Created with IntelliJ IDEA.
 * author: Sigma Miao
 * create on: 2017/9/17 下午6:13
 */
public class ServerImplContext {
    
    private final String name;
    
    public ServerImplContext(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
