import '../../init'; // hidden-full-source-line
import '@vaadin/flow-frontend/comboBoxConnector'; // hidden-full-source-line

import { html, LitElement, customElement, internalProperty } from 'lit-element';
import '@vaadin/vaadin-combo-box/vaadin-combo-box';
import { getCountries } from '../../domain/DataService';
import Country from '../../../generated/com/vaadin/demo/domain/Country';

@customElement('combo-box-filtering-1')
export class Example extends LitElement {
  @internalProperty()
  private items: Country[] = [];

  async firstUpdated() {
    this.items = await getCountries();
  }

  render() {
    return html`
      <!-- tag::snippet[] -->
      <vaadin-combo-box
        label="Country"
        item-label-path="name"
        item-value-path="id"
        .items="${this.items}"
      ></vaadin-combo-box>
      <!-- end::snippet[] -->
    `;
  }
}
