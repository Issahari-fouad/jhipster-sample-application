import { Moment } from 'moment';
import { IProduct } from 'app/shared/model/product.model';
import { CategoryStatus } from 'app/shared/model/enumerations/category-status.model';

export interface ICategory {
  id?: number;
  name?: string;
  description?: string;
  sortOrder?: number;
  dateAdded?: Moment;
  dateModified?: Moment;
  status?: CategoryStatus;
  products?: IProduct[];
  subCategories?: ICategory[];
  category?: ICategory;
}

export class Category implements ICategory {
  constructor(
    public id?: number,
    public name?: string,
    public description?: string,
    public sortOrder?: number,
    public dateAdded?: Moment,
    public dateModified?: Moment,
    public status?: CategoryStatus,
    public products?: IProduct[],
    public subCategories?: ICategory[],
    public category?: ICategory
  ) {}
}
