/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.transport.modbus;

import org.apache.commons.lang.builder.StandardToStringStyle;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.openhab.io.transport.modbus.ModbusManager.WriteTask;
import org.openhab.io.transport.modbus.endpoint.ModbusSlaveEndpoint;

/**
 * Simple implementation for Modbus write requests
 *
 * @author Sami Salonen
 *
 */
public class WriteTaskImpl implements WriteTask {

    private static final StandardToStringStyle toStringStyle = new StandardToStringStyle();
    static {
        toStringStyle.setUseShortClassName(true);
    }

    private ModbusSlaveEndpoint endpoint;
    private ModbusWriteRequestBlueprint request;

    public WriteTaskImpl(ModbusSlaveEndpoint endpoint, ModbusWriteRequestBlueprint request) {
        super();
        this.endpoint = endpoint;
        this.request = request;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModbusSlaveEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModbusWriteRequestBlueprint getRequest() {
        return request;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, toStringStyle).append("request", request).append("endpoint", endpoint)
                .toString();
    }
}