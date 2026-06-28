.class public interface abstract Lcom/huawei/agconnect/common/api/AAID;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/huawei/agconnect/common/api/AAID;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/agconnect/credential/obs/a;

    invoke-direct {v0}, Lcom/huawei/agconnect/credential/obs/a;-><init>()V

    sput-object v0, Lcom/huawei/agconnect/common/api/AAID;->INSTANCE:Lcom/huawei/agconnect/common/api/AAID;

    return-void
.end method


# virtual methods
.method public abstract getId()Ljava/lang/String;
.end method
