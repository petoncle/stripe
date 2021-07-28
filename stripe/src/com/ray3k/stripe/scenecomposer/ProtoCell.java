/*******************************************************************************
 * MIT License
 *
 * Copyright (c) 2021 Raymond Buckley
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package com.ray3k.stripe.scenecomposer;

import com.badlogic.gdx.utils.Align;

public class ProtoCell extends ProtoActor implements SimSingleChild {
    public ProtoActor child;
    public int row;
    public int column;
    public float padLeft;
    public float padRight;
    public float padTop;
    public float padBottom;
    public float spaceLeft;
    public float spaceRight;
    public float spaceTop;
    public float spaceBottom;
    public boolean expandX;
    public boolean expandY;
    public boolean fillX;
    public boolean fillY;
    public boolean growX;
    public boolean growY;
    public int alignment = Align.center;
    public float minWidth = -1;
    public float minHeight = -1;
    public float maxWidth = -1;
    public float maxHeight = -1;
    public float preferredWidth = -1;
    public float preferredHeight = -1;
    public boolean uniformX;
    public boolean uniformY;
    public int colSpan = 1;
}
