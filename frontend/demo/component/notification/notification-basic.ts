import '../../init'; // hidden-full-source-line

import { render } from 'lit-html';
import { html, LitElement, customElement, internalProperty } from 'lit-element';
import '@vaadin/vaadin-button/vaadin-button';
import '@vaadin/vaadin-lumo-styles/icons';

@customElement('notification-basic')
export class Example extends LitElement {
  @internalProperty()
  private notificationOpen = false;

  render() {
    return html`
      <vaadin-button @click="${() => (this.notificationOpen = true)}">Try it</vaadin-button>

      <!-- tag::snippet[] -->
      <vaadin-notification
        .opened=${this.notificationOpen}
        @opened-changed=${(e: CustomEvent) => (this.notificationOpen = e.detail.value)}
        .renderer="${this.boundRenderer}"
        position="middle"
      ></vaadin-notification>
      <!-- end::snippet[] -->
    `;
  }

  private boundRenderer = this.renderer.bind(this);

  renderer(root: HTMLElement) {
    render(
      html`
        <div>Financial report generated</div>
        <vaadin-button
          theme="tertiary-inline"
          @click="${() => (this.notificationOpen = false)}"
          aria-label="Close"
        >
          <iron-icon icon="lumo:cross"></iron-icon>
        </vaadin-button>
      `,
      root
    );
  }
}
