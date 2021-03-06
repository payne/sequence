/*
 * SEQUENCE - A very simple sequence diagram editor
 * Copyright (C) 2002, 2003, 2004 Alex Moffat
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package com.zanthan.sequence.parser;

import java.io.Reader;

import com.zanthan.sequence.diagram.DiagramParserIface;

public interface Parser {

    /**
     * Set the diagram the parser should add nodes to.
     *
     * @param diagram the diagram to build
     */
    void setDiagram(DiagramParserIface diagram);

    /**
     * Parse a string. The results of the parse are added to the diagram.
     *
     * @param s the string to parse
     */
    void parse(String s) throws ParserException;

    /**
     * Parse the characters provided by a Reader. The results of the
     * parse are added to the diagram.
     *
     * @param r the reader to parse
     */
    void parse(Reader r) throws ParserException;

}
