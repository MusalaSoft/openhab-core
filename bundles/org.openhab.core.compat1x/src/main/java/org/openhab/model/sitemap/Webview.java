/**
 * Copyright (c) 2015-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
/**
 */
package org.openhab.model.sitemap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Webview</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhab.model.sitemap.Webview#getHeight <em>Height</em>}</li>
 * <li>{@link org.openhab.model.sitemap.Webview#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhab.model.sitemap.SitemapPackage#getWebview()
 * @model
 * @author Kai Kreuzer - Initial contribution
 */
public interface Webview extends NonLinkableWidget {
    /**
     * Returns the value of the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Height</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Height</em>' attribute.
     * @see #setHeight(int)
     * @see org.openhab.model.sitemap.SitemapPackage#getWebview_Height()
     * @model
     */
    int getHeight();

    /**
     * Sets the value of the '{@link org.openhab.model.sitemap.Webview#getHeight <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Height</em>' attribute.
     * @see #getHeight()
     */
    void setHeight(int value);

    /**
     * Returns the value of the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Url</em>' attribute.
     * @see #setUrl(String)
     * @see org.openhab.model.sitemap.SitemapPackage#getWebview_Url()
     * @model
     */
    String getUrl();

    /**
     * Sets the value of the '{@link org.openhab.model.sitemap.Webview#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     */
    void setUrl(String value);

} // Webview
