.class public Lcom/huawei/agconnect/apms/e1$bcd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/e1;->bcd()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic abc:Lcom/huawei/agconnect/apms/util/Session;

.field public final synthetic bcd:Lcom/huawei/agconnect/apms/e1;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/e1;Lcom/huawei/agconnect/apms/util/Session;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/e1$bcd;->bcd:Lcom/huawei/agconnect/apms/e1;

    iput-object p2, p0, Lcom/huawei/agconnect/apms/e1$bcd;->abc:Lcom/huawei/agconnect/apms/util/Session;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/apms/e1$bcd;->bcd:Lcom/huawei/agconnect/apms/e1;

    iget-object v1, p0, Lcom/huawei/agconnect/apms/e1$bcd;->abc:Lcom/huawei/agconnect/apms/util/Session;

    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/e1;->abc(Lcom/huawei/agconnect/apms/e1;Lcom/huawei/agconnect/apms/util/Session;)V

    return-void
.end method
