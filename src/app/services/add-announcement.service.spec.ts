import { TestBed } from '@angular/core/testing';

import { AddAnnouncementService } from './add-announcement.service';

describe('AddAnnouncementService', () => {
  let service: AddAnnouncementService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AddAnnouncementService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
