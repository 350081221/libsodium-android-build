.class public final synthetic Ls1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/huawei/agconnect/apms/ijk;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/huawei/agconnect/apms/ijk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/e;->a:Landroid/content/Context;

    iput-object p2, p0, Ls1/e;->b:Lcom/huawei/agconnect/apms/ijk;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls1/e;->a:Landroid/content/Context;

    iget-object v1, p0, Ls1/e;->b:Lcom/huawei/agconnect/apms/ijk;

    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/wvu;->bcd(Landroid/content/Context;Lcom/huawei/agconnect/apms/ijk;)V

    return-void
.end method
