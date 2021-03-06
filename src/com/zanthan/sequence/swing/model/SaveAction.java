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
package com.zanthan.sequence.swing.model;

import org.apache.log4j.Logger;

public class SaveAction
        extends ModifiedEnabledAction {

    private static final Logger log =
            Logger.getLogger(SaveAction.class);

    SaveAction(Model model) {
        super("SaveAction", model);
    }

    public boolean doIt() {
        if (getModel().getFile() != null) {
            return getModel().writeToFile(getModel().getFile());
        } else {
            return getModel().getSaveAsAction().doIt();
        }
    }
}
