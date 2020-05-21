import { IAddress } from 'app/shared/model/address.model';
import { IWishList } from 'app/shared/model/wish-list.model';

export interface ICustomer {
  id?: number;
  firstName?: string;
  lastName?: string;
  email?: string;
  telephone?: string;
  addresses?: IAddress[];
  wishLists?: IWishList[];
}

export class Customer implements ICustomer {
  constructor(
    public id?: number,
    public firstName?: string,
    public lastName?: string,
    public email?: string,
    public telephone?: string,
    public addresses?: IAddress[],
    public wishLists?: IWishList[]
  ) {}
}
