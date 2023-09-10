class Solution 
{
    private static final int mod=1000000007;

    public int countOrders(int n)
    {
        long count=1;//if we have only 1 pickup and 1 delivery so we have just one way to arrange ie P1 D1

        for(int i=2;i<=n;i++)//we already solved the 1st one so start from 2
        {
            count=(count*(2*i-1)*i)%mod;
        }
        return (int)count;
    }
}

//What's the deal with 2i - 1 and i?

// Let's say you're at the i-th order. You would have i pickups and i deliveries, making it 2i positions in total.
// Now, when you're adding the pickup (Pi) for the i-th order, you can put it anywhere except at the end. That's 2i - 1 choices for Pi.
// For Di, you only have i choices, because it must come after Pi.
