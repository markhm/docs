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
package com.vaadin.mpr.documentation.configuration;

import com.vaadin.flow.component.html.Div;
import com.vaadin.mpr.LegacyWrapper;
import com.vaadin.mpr.core.HasLegacyComponents;
import com.vaadin.mpr.documentation.annotations.CodeFor;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

@CodeFor("configuration/adding-legacy-components.asciidoc")
public class AddingFwComponents extends Div {

    public void legacyWrapper() {
        Button button = new Button("Legacy button");
        add(new LegacyWrapper(button));

        // Vaadin 7 or 8 VerticalLayout
        VerticalLayout legacyLayout = new VerticalLayout();
        LegacyWrapper wrapper = new LegacyWrapper(legacyLayout);
        wrapper.setSizeFull();
        add(wrapper);
    }

    // Flow layout
    public class MainLayout extends Div implements HasLegacyComponents {

        public MainLayout() {
            Button button = new Button("Legacy button");
            add(button); // no wrapping is needed
        }
    }

}
