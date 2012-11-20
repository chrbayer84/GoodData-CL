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

package com.gooddata.integration.model;

import net.sf.json.JSONObject;

/**
 * GoodData project object wrapper
 *
 * @author zd <zd@gooddata.com>
 * @version 1.0
 */
public class Project {

    private String link;
    private String id;
    private String title;

    /**
     * Constructs the GoodData project from the JSON structure
     *
     * @param obj the JSON structure taken from the GoodData REST API
     */
    public Project(JSONObject obj) {
        super();
        link = obj.getString("link");
        id = obj.getString("identifier");
        title = obj.getString("title");
    }

    public Project(String l, String i, String t) {
        super();
        link = l;
        id = i;
        title = t;
    }

    /**
     * Returns the project's URI
     *
     * @return the project's URI
     */
    public String getUri() {
        return link;
    }

    /**
     * Returns the project's ID
     *
     * @return the project's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the project's name
     *
     * @return the project's name
     */
    public String getName() {
        return title;
    }

    @Override
    public String toString() {
	return "Project [link=" + link + ", id=" + id + ", title=" + title
		+ "]";
    }
}