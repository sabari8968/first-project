import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { AppModule } from './app/Employee.module';

platformBrowserDynamic()
  .bootstrapModule(AppModule)
  .catch((err) => console.error(err));
