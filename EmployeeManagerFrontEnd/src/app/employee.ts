// To define the interface for employee service, so that the data that we recieve/send is in this form

// We use interface, so we don't have to instantiate like a class, because interface is not instantiated.
export interface Employee {
    id: number;
    name: string;
    email: string;
    jobTitle: string;
    phone: string;
    imageURL: string;
    employeeCode: string;
}
