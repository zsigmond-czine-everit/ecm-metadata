/**
 * This file is part of Everit - ECM Metadata.
 *
 * Everit - ECM Metadata is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - ECM Metadata is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - ECM Metadata.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.ecm.metadata;

/**
 * Helper interface to extend original functionlity (like an instantiation of
 * {@code AttributeDefinition}) with {@link AttributeMetadata} information.
 *
 * @param <V_ARRAY>
 *          Array type of the value type of the metadata.
 */
public interface AttributeMetadataHolder<V_ARRAY> {

  /**
   * Retrieve the {@link AttributeMetadata} that belongs to the object that implements this
   * interface.
   *
   * @return The {@link AttributeMetadata} instance.
   */
  public AttributeMetadata<V_ARRAY> getMetadata();
}
