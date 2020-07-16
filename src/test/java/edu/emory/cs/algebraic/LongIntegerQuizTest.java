/*
 * Copyright 2020 Emory University
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
package edu.emory.cs.algebraic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** @author Jinho D. Choi */
public class LongIntegerQuizTest {
    @Test
    public void test0() {
        LongInteger a = new LongIntegerQuizSol("123");
        a.add(new LongIntegerQuizSol("0"));
        assertEquals("123", a.toString());
    }

    @Test
    public void test2() {
        LongInteger a = new LongIntegerQuizSol("123");
        a.add(new LongIntegerQuizSol("-0"));
        assertEquals("123", a.toString());
    }

    @Test
    public void test3() {
        LongInteger a = new LongIntegerQuizSol("123");
        a.add(new LongIntegerQuizSol("-123"));
        assertEquals("0", a.toString());
    }

    @Test
    public void test4() {
        LongInteger a = new LongIntegerQuizSol("-123");
        a.add(new LongIntegerQuizSol("123"));
        assertEquals("-0", a.toString());
    }

    @Test
    public void test5() {
        LongInteger a = new LongIntegerQuizSol("123");
        a.add(new LongIntegerQuizSol("-122"));
        assertEquals("1", a.toString());
    }

    @Test
    public void test6() {
        LongInteger a = new LongIntegerQuizSol("-123");
        a.add(new LongIntegerQuizSol("122"));
        assertEquals("-1", a.toString());
    }

    @Test
    public void test7() {
        LongInteger a = new LongIntegerQuizSol("123");
        a.add(new LongIntegerQuizSol("-124"));
        assertEquals("-1", a.toString());
    }

    @Test
    public void test8() {
        LongInteger a = new LongIntegerQuizSol("-123");
        a.add(new LongIntegerQuizSol("124"));
        assertEquals("1", a.toString());
    }

    @Test
    public void test9() {
        LongInteger a = new LongIntegerQuizSol("123");
        a.add(new LongIntegerQuizSol("-45678"));
        assertEquals("-45555", a.toString());
    }

    @Test
    public void test10() {
        LongInteger a = new LongIntegerQuizSol("-12345");
        a.add(new LongIntegerQuizSol("678"));
        assertEquals("-11667", a.toString());
    }
}
