import { Component, Input } from '@angular/core';
import { infoCard } from 'src/app/interfaces/infoCard';

@Component({
  selector: 'app-info-block',
  templateUrl: './info-block.component.html',
  styleUrls: ['./info-block.component.css'],
})
export class InfoBlockComponent {
  @Input() card: infoCard;
}
