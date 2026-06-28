.class public final synthetic Lcom/yuanqi/master/location/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/location/AddressAdapter;

.field public final synthetic b:Lcom/yuanqi/master/location/AddressAdapter$ViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/location/AddressAdapter;Lcom/yuanqi/master/location/AddressAdapter$ViewHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/location/a;->a:Lcom/yuanqi/master/location/AddressAdapter;

    iput-object p2, p0, Lcom/yuanqi/master/location/a;->b:Lcom/yuanqi/master/location/AddressAdapter$ViewHolder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/location/a;->a:Lcom/yuanqi/master/location/AddressAdapter;

    iget-object v1, p0, Lcom/yuanqi/master/location/a;->b:Lcom/yuanqi/master/location/AddressAdapter$ViewHolder;

    invoke-static {v0, v1, p1}, Lcom/yuanqi/master/location/AddressAdapter;->a(Lcom/yuanqi/master/location/AddressAdapter;Lcom/yuanqi/master/location/AddressAdapter$ViewHolder;Landroid/view/View;)V

    return-void
.end method
