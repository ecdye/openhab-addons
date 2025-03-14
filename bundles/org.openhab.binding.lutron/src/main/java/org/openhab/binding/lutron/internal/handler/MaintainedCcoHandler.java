/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.lutron.internal.handler;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.Thing;

/**
 * Subclass that configures CcoHandler for Maintained outputs.
 *
 * @author Bob Adair - Initial contribution
 */
@NonNullByDefault
public class MaintainedCcoHandler extends CcoHandler {

    public MaintainedCcoHandler(Thing thing) {
        super(thing);
        this.outputType = CcoOutputType.MAINTAINED;
    }
}
