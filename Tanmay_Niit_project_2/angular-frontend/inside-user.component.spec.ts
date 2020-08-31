import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InsideUserComponent } from './inside-user.component';

describe('InsideUserComponent', () => {
  let component: InsideUserComponent;
  let fixture: ComponentFixture<InsideUserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InsideUserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InsideUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
