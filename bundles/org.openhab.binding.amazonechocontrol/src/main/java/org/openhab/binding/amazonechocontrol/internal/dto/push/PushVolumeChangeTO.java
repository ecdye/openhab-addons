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
package org.openhab.binding.amazonechocontrol.internal.dto.push;

import org.eclipse.jdt.annotation.NonNull;

/**
 * The {@link PushVolumeChangeTO} encapsulates PUSH_VOLUME_CHANGE messages
 *
 * @author Jan N. Klug - Initial contribution
 */
public class PushVolumeChangeTO extends PushDeviceTO {
    public boolean isMuted;
    public int volumeSetting;

    @Override
    public @NonNull String toString() {
        return "PushVolumeChangeTO{isMuted=" + isMuted + ", volumeSetting=" + volumeSetting + ", destinationUserId='"
                + destinationUserId + "', dopplerId=" + dopplerId + "}";
    }
}
