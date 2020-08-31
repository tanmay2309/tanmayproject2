import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { StudentListComponent } from './student-list/student-list.component';  
import { AddStudentComponent } from './add-student/add-student.component';  
import { UserLoginComponent } from './user-login/user-login.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { InsideUserComponent } from './inside-user/inside-user.component';
import { InsideAdminComponent } from './inside-admin/inside-admin.component';


const routes: Routes = [
  { path: '', redirectTo: 'view-student', pathMatch: 'full' },  
  { path: 'view-student', component: StudentListComponent },  
  { path: 'add-student', component: AddStudentComponent },
  { path: 'user-login', component: UserLoginComponent }, 
  { path: 'admin-login', component: AdminLoginComponent },
  { path: 'inside-user', component: InsideUserComponent },
  { path: 'inside-admin', component: InsideAdminComponent } 
 
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
