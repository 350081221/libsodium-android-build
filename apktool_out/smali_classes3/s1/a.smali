.class public final synthetic Ls1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FilenameFilter;


# instance fields
.field public final synthetic a:Lcom/huawei/agconnect/apms/ihg;

.field public final synthetic b:Ljava/text/SimpleDateFormat;


# direct methods
.method public synthetic constructor <init>(Lcom/huawei/agconnect/apms/ihg;Ljava/text/SimpleDateFormat;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/a;->a:Lcom/huawei/agconnect/apms/ihg;

    iput-object p2, p0, Ls1/a;->b:Ljava/text/SimpleDateFormat;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Ls1/a;->a:Lcom/huawei/agconnect/apms/ihg;

    iget-object v1, p0, Ls1/a;->b:Ljava/text/SimpleDateFormat;

    invoke-static {v0, v1, p1, p2}, Lcom/huawei/agconnect/apms/ihg;->a(Lcom/huawei/agconnect/apms/ihg;Ljava/text/SimpleDateFormat;Ljava/io/File;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
