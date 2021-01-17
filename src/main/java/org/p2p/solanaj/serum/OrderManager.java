package org.p2p.solanaj.serum;

import org.p2p.solanaj.core.PublicKey;
import org.p2p.solanaj.rpc.Cluster;
import org.p2p.solanaj.rpc.RpcClient;

import java.util.logging.Logger;

public class OrderManager {

    private static final Logger LOGGER = Logger.getLogger(OrderManager.class.getName());
    private final RpcClient client = new RpcClient(Cluster.MAINNET);
    private final PublicKey publicKey = new PublicKey("skynetDj29GH6o6bAqoixCpDuYtWqi1rm8ZNx1hB3vq");

    /**
     * Places order at the specified {@link Market} with the given {@link Order}
     * @param market Market to trade on
     * @param order Buy or sell order with quantity and price
     * @return true if the order succeeded
     */
    public boolean placeOrder(Market market, Order order) {




        // client.getApi().sendTransaction(...)

        return true;
    }



}