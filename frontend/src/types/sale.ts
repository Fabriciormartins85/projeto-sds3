import { Seller } from './seller';

export type Sales = {
        id: number;
        visited: number;
        deals: number;
        amount: number;
        date:  string;
        seller: Seller; 
        
}
export type SalePage = {
   content?: Sales[];
   last: boolean;
   totalPages: number;
   totalElements: number;
   size?: number;
   number: number;
   first: boolean;
   numberOfElements?: number;
   empty?: boolean;

}

export type SaleSum = {
    sellerName: string;
    sum: number
}

export type SaleSuccess = {
    sellerName: string;
    visited: number;
    deals: number;
}