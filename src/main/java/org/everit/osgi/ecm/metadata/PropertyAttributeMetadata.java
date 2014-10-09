/**
 * This file is part of Everit - Component Metadata.
 *
 * Everit - Component Metadata is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - Component Metadata is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - Component Metadata.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.ecm.metadata;

import org.everit.osgi.ecm.util.method.MethodDescriptor;

public abstract class PropertyAttributeMetadata<V> extends AttributeMetadata<V> {

    public static abstract class PropertyAttributeMetadataBuilder<V, B extends PropertyAttributeMetadataBuilder<V, B>>
            extends AttributeMetadataBuilder<V, B> {

        private MethodDescriptor setter = null;

        public B withSetter(final MethodDescriptor setter) {
            this.setter = setter;
            return self();
        }
    }

    private final MethodDescriptor setter;

    protected <B extends PropertyAttributeMetadataBuilder<V, B>> PropertyAttributeMetadata(
            final PropertyAttributeMetadataBuilder<V, B> builder) {

        super(builder);

        this.setter = builder.setter;
    }

    public Class<?> getPrimitiveType() {
        if (isOptional()) {
            return null;
        }
        return getPrimitiveTypeInternal();
    }

    public abstract Class<?> getPrimitiveTypeInternal();

    public MethodDescriptor getSetter() {
        return setter;
    }
}
