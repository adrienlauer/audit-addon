/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.audit.internal;

import org.seedstack.audit.api.TrailExceptionHandler;
import org.seedstack.seed.security.api.exceptions.AuthorizationException;

/**
 * The implementation of trail exception handler for the security.
 */
public class SecurityTrailExceptionHandler implements TrailExceptionHandler<AuthorizationException> {

    @Override
    public String describeException(AuthorizationException e) {
        return "Authorization exception: user does not have sufficient rights";
    }
}
