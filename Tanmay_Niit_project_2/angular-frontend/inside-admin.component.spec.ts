import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InsideAdminComponent } from './inside-admin.component';

describe('InsideAdminComponent', () => {
  let component: InsideAdminComponent;
  let fixture: ComponentFixture<InsideAdminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InsideAdminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InsideAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
