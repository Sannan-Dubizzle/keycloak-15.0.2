/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.testsuite.ui.account2.page.fragment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.keycloak.testsuite.util.UIUtils.clickLink;
import static org.keycloak.testsuite.util.UIUtils.getTextFromElement;

/**
 * @author Vaclav Muzikar <vmuzikar@redhat.com>
 */
public class LoggedInPageHeader extends AbstractHeader {
    @FindBy(id = "signOutButton")
    private WebElement logoutBtn;
    @FindBy(id = "signOutLink")
    private WebElement logoutBtnMobile;

    @FindBy(id = "locale-dropdown-toggle")
    private WebElement localeBtn;
    @FindBy(id = "mobile-locale")
    private WebElement localeBtnMobile;

    @FindBy(xpath = "//ul[@aria-labelledby='locale-dropdown-toggle']")
    private WebElement localeDropdown;
    @FindBy(xpath = "//section[@aria-labelledby='mobile-locale']")
    private WebElement localeDropdownMobile;

    @FindBy(id = "referrerLink")
    private WebElement referrerLink;
    @FindBy(id = "referrerMobileLink")
    private WebElement referrerLinkMobile;

    @FindBy(id = "landingMobileDropdown")
    private WebElement mobileKebab;

    @FindBy(id = "loggedInUser")
    private WebElement toolbarLoggedInUser;

    @Override
    public void clickMobileKebab() {
        clickLink(mobileKebab);
    }

    @Override
    protected WebElement getLogoutBtn() {
        return isMobileLayout() ? logoutBtnMobile : logoutBtn;
    }

    @Override
    protected WebElement getReferrerLink() {
        return isMobileLayout() ? referrerLinkMobile : referrerLink;
    }

    public String getToolbarLoggedInUser() {
        return getTextFromElement(toolbarLoggedInUser);
    }
}
