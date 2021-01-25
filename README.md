# Fractional_Reserve_Banking_Tute
Introduction
Banks can lend out money on a fractional reserve (FR) basis. Some banks only need to keep a 10% reserve of depositors’ money, while others might only have a 20% reserve requirement. Consequently, the remainder can be lent out to qualified borrowers.
Muhamad Jeghol (MJ) is an MBA student who wants to know how fractional reserve banking works. He set forth the following restrictions in order to aid his understanding of the concept:
1. In the beginning, each bank has no existing depositors.
2. Each bank can only cater for one depositor and one borrower.
3. The total number of banks is 𝑁. Each bank is referred to as 𝐵𝑖 where 𝑖={1,2,…,𝑁}.
4. Each bank’s reserve requirement is 10%, except for the final bank in the simulation. 𝐵𝑁’s reserve requirement is 100%, which means that it cannot provide any loans to anybody.
5. Money borrowed from bank 𝐵𝑖 can only be eventually and fully deposited into bank 𝐵𝑖+1.
• For example, RM5,000 borrowed from 𝐵1 can only be fully deposited into 𝐵2. Then, the amount that 𝐵2 can lend can only be fully deposited into 𝐵3. This continues until bank 𝐵𝑁, at which the money lending stops.
MJ wants to know the grand total amount (in RM) lent out by all the banks. He however needs to know the amount of the initial deposit (i.e. the amount deposited into 𝐵1) as well the number of banks involved.
Input
Two inputs are required:
1. The initial deposit that goes into the first bank 𝐵1. (type Double)
2. The number of banks 𝑁 that MJ wants to simulate.
Output
1. The amount deposited into each bank (two decimal places).
2. The amount that can be lent out by each bank (two decimal places).
3. The total amount of money lent out by all 𝑁 banks (in two decimal places).
