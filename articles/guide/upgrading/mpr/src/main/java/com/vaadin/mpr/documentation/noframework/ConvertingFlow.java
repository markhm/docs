/**
 * Copyright (C) 2018 Vaadin Ltd
 *
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 *
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 *
 * You should have received a copy of the license along with this program.
 * If not, see <http://vaadin.com/license/cval-3>.
 */
package com.vaadin.mpr.documentation.noframework;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.mpr.core.HasLegacyComponents;
import com.vaadin.mpr.documentation.annotations.CodeFor;
import com.vaadin.ui.HorizontalLayout;

@CodeFor("introduction/step-3-no-framework.asciidoc")
public class ConvertingFlow {

    @Route("")
    public class AddressbookLayout extends Div implements HasLegacyComponents {
        private HorizontalLayout content = new HorizontalLayout();

        public AddressbookLayout() {
            content.setSizeFull();
            add(content);
        }
    }
}
