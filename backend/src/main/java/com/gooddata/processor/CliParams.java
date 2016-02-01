/*
 * Copyright (c) 2009, GoodData Corporation. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided
 * that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice, this list of conditions and
 *        the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright notice, this list of conditions
 *        and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *     * Neither the name of the GoodData Corporation nor the names of its contributors may be used to endorse
 *        or promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 * AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.gooddata.processor;

import com.gooddata.integration.rest.configuration.NamePasswordConfiguration;
import org.apache.log4j.Logger;

import java.util.HashMap;

/**
 * GoodData CLI parameters wrapper
 *
 * @author zd <zd@gooddata.com>
 * @version 1.0
 */
public class CliParams extends HashMap<String, String> {

    private NamePasswordConfiguration httpConfig = null;

    private static Logger l = Logger.getLogger(CliParams.class);

    /**
     * HTTP config getter
     *
     * @return HTTP config
     */
    public NamePasswordConfiguration getHttpConfig() {
        return httpConfig;
    }

    /**
     * HTTP config setter
     *
     * @param httpConfig HTTP config
     */
    public void setHttpConfig(NamePasswordConfiguration httpConfig) {
        this.httpConfig = httpConfig;
    }
}
